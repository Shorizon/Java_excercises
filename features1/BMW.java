package com.qa.java.oop.features;

public class BMW extends Car{

	int noOfCylinders;
	int maxTorque;


	public BMW(int id, String name, float price, String engineCC, String fuelType, int manifacturingYear,
			int noOfCylinders, int maxTorque) {
		super(id, name, price, engineCC, fuelType, manifacturingYear);
		this.noOfCylinders = noOfCylinders;
		this.maxTorque = maxTorque;
	}

	public void displayBMW() {
		displayCar();
		System.out.println("Cylinders: "+this.noOfCylinders);
		System.out.println("Torque: "+ this.maxTorque);
	}


}
