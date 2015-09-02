package com.salesforce.test;

public class Parent {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.displayName();
		
		showProject();

	}
	
	public static void showProject(){
		System.out.println("Project1");
		System.out.println("Happy sales people");
		System.out.println("_______________________");
	}

}
