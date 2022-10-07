package com.qa.java.oop.features;

public class Audi extends Car {

	String model;
	Boolean isAvailable;


	public Audi(int id, String name, float price, String engineCC, String fuelType, int manifacturingYear, String model,
			Boolean isAvailable) {
		super(id, name, price, engineCC, fuelType, manifacturingYear);
		this.model = model;
		this.isAvailable = isAvailable;
	}

	public void displayAudi() {
		displayCar();
		System.out.println("exact model: "+this.model);
		System.out.println("Available: "+ this.isAvailable);

	}








}
