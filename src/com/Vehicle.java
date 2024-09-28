package com;

public class Vehicle {
   String brand ="Audi";
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Driving Car");
		
	}
}
class Bike extends Vehicle{
	void ride() {
		System.out.println("riding bike ");
		
	}
}