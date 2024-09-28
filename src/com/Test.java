package com;


public class Test {
//
	//1. Father obj = new son();
	//2.Father obj = new Daughter();
	static void display(Father obj) {
		if (obj instanceof Son) {
			System.out.println("Downcasting to Son");
			Son s =(Son)obj;
			System.out.println(s.x+" "+s.y);
		}
		else if (obj instanceof Daughter) {
			System.out.println("Downcasting to Daughter");
			Daughter d =(Daughter)obj;
			System.out.println(d.x+" "+d.z);
			
		}

	}
	public static void main(String[] args) {
		//1.passing son Instance
		display(new Son());
		System.out.println("-------");
		
		
		
		//2.passing Daughter instance
		display(new Daughter());
	
	System.out.println("------------");
	
	}







}
