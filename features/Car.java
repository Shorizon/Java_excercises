package com.qa.java.oop.features;

public class Car {
	int id;
	String name;
	float price;
	String engineCC;
	String fuelType;
	int manifacturingYear;


	public Car(int id, String name, float price, String engineCC, String fuelType, int manifacturingYear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manifacturingYear = manifacturingYear;
	}

	public void displayCar() {

		System.out.println("car id: "+id);
		System.out.println("car name: "+name);
		System.out.println("car price: " + price);
		System.out.println("engine????? : " +engineCC);
		System.out.println("fuel type: " + fuelType);
		System.out.println("year of manifacture: "+ manifacturingYear);

	}



}
