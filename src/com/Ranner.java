package com;

public class Ranner {
	
	static void display(Employee obj) {
		if(obj instanceof Developer) {
			Developer d = (Developer)obj;
			System.out.println("name :"+d.name);
			d.develop();
			
		}
		else if(obj instanceof Tester){
			Tester t = (Tester)obj;
			System.out.println("name :"+t.name);
			t.test();
			
		}
	}
	
	
	
	
	
	
public static void main(String[] args) {
	display(new Developer());
	System.out.println("====================================");
	display(new Tester());
	
	
}
}
