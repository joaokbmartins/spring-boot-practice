package com.joao.springbootweb.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

	private int id;
	private String model;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + "]";
	}

}
