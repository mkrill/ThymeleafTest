package de.krillonline.ThymeleafTest;

public class Instrument {
	
	public Long id;
	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public Instrument(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
