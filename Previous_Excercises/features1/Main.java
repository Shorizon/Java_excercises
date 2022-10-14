package com.qa.java.oop.features;

public class Main {


	public static void main(String args[]) {


//		Car newCar = new Car(12, "Honda", 120000.12f, "diesel", "idk", 2022);
//		newCar.displayCar();

		
		Audi newAudi = new Audi(130, "Audi", 120000.12f, "Electric", "gas", 2022,"23x-ddd0",true);
		newAudi.displayAudi();

		System.out.println(" ==========================================");

		BMW newBMW = new BMW(130, "BMW", 120000.12f, "Electric", "Diesel", 2022,200,24);
		newBMW.displayBMW();
	}	
}
