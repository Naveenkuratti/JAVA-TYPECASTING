package com;

public class Employee {
String name ="jack";

}

class Developer extends Employee{
	void develop() {
		System.out.println("Developer is developing software");
	}
}

class Tester extends Employee{
	void test() {
		System.out.println("Tester is testing software");
	}
}




