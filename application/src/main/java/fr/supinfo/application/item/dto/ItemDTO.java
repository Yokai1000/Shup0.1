package fr.supinfo.application.item.dto;

public class ItemDTO {

	private Long id;

	private String name;

	private Float price;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(final Float price) {
		this.price = price;
	}
}
