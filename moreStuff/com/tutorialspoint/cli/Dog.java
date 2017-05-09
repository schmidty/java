package com.tutorialspoint.cli;

public class Dog {
	String breed;
	int ageC;
	String color;

	void barking() {
		System.out.println("Woof!");	
	}

	void hungry() {
		System.out.println("feed me");	
	}

	void sleeping() {
		System.out.println("Zzzzzzzz");	
	}

	public static void main(String args[]) {
		if (args.length > 0) {
			System.out.println("Pepe says '"+args[0]+"'");
		}

		Dog dog = new Dog();
		
		dog.barking();
		dog.sleeping();
		dog.hungry();
		
	}
}
