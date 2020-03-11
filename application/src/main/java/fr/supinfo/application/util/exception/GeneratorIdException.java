package fr.supinfo.application.util.exception;

public class GeneratorIdException extends RuntimeException {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = -1006162961207124430L;

	/**
	 * Constructor
	 */
	public GeneratorIdException() {
		super();
	}

	/**
	 * Constructor
	 *
	 * @param message            the detail message (which is saved for later
	 *                           retrieval by the Throwable.getMessage() method).
	 * @param cause              Cause d'exception
	 * @param enableSuppression  whether or not suppression is enabled or disabled
	 * @param writableStackTrace whether or not the stack trace should be writable
	 */
	public GeneratorIdException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Constructor
	 *
	 * @param message the detail message (which is saved for later retrieval by the
	 *                Throwable.getMessage() method).
	 * @param cause   the cause (which is saved for later retrieval by the
	 *                Throwable.getCause() method). (A null value is permitted, and
	 *                indicates that the cause is nonexistent or unknown.)
	 */
	public GeneratorIdException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor
	 *
	 * @param message the detail message (which is saved for later retrieval by the
	 *                Throwable.getMessage() method).
	 */
	public GeneratorIdException(final String message) {
		super(message);
	}

	/**
	 * Constructor
	 *
	 * @param cause the cause (which is saved for later retrieval by the
	 *              Throwable.getCause() method). (A null value is permitted, and
	 *              indicates that the cause is nonexistent or unknown.)
	 */
	public GeneratorIdException(final Throwable cause) {
		super(cause);
	}

}
