package com.lumen.abs;

public class VehicleDemo {

	public static void main(String[] args) {

		Vehicle vehicle = new Bike("Sports","KtM",13313);
		vehicle.printDetails();
		vehicle.getMileage();
		vehicle.showType();
		
		Bike bike = (Bike)vehicle;
		bike.showType();
		
		vehicle = new Car("MVP","Punch",200000);
		vehicle.printDetails();
		
		Car car = (Car) vehicle;
		car.getMileage();
		car.showType();
		car.showAccessories(new String [] {"window cover","bag"});
		
	}

}