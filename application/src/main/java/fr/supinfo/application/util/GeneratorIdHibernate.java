package fr.supinfo.application.util;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.Table;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import fr.supinfo.application.util.exception.GeneratorIdException;

@Configuration
public class GeneratorIdHibernate implements IdentifierGenerator {

	private static final Logger LOGGER = LoggerFactory.getLogger(GeneratorIdHibernate.class);

	@Override
	public Serializable generate(final SharedSessionContractImplementor session, final Object obj) {

		final Connection connection = session.connection();

		try {
			final Object retourGetId = obj.getClass().getMethod("getId").invoke(obj);

			if ((retourGetId == null) || ((long) retourGetId == 0)) {

				LOGGER.debug("Id obtenu: {}", retourGetId);
				LOGGER.debug("Classe obtenu: {}", obj.getClass().getAnnotationsByType(Table.class)[0].name());

				final String sql = "select max(id) as Id from "
						+ obj.getClass().getAnnotationsByType(Table.class)[0].name();

				return this.getMaxIdDatabase(connection, sql);
			} else {
				return (long) retourGetId;
			}
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e1) {
			throw new GeneratorIdException("Impossibilite de générer l'identifiant de l'entite: " + obj.getClass(), e1);
		}

	}

	private Long getMaxIdDatabase(final Connection connection, final String sql) {
		try (final PreparedStatement statement = connection.prepareStatement(sql);) {

			try (final ResultSet rs = statement.executeQuery();) {

				if (rs.next()) {
					return rs.getLong(1) + 1;
				}
			}
		} catch (final SQLException e) {
			throw new GeneratorIdException("Impossibilite de générer l'identifiant de l'entite: " + sql, e);
		}
		return null;
	}

}
