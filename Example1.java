package com.TwentyThird.April;


class Dog{
	
	// The public type Dog must be defined in its own file
	//properties of dog
	String name;
	String color;
	float cost;
	String breed;
	int age;
	
	//Behavior of the dog
	void eat() {
		System.out.println("Dog eats.....");
	}
	void run() {
		System.out.println("Dog runs.....");
	}

	void bark() {
		System.out.println("Dog barks.....");
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 10;  // permitted
		byte b = 100; // permitted
		byte c = 127; //yes
		// byte b = 128; //no , not permitted

		Dog d = new Dog();
		System.out.println("The address of the dog d is: " +d);
		
		d.name = "Tommy";
		d.color = "Black";
		d.cost = 2000;
		d.age = 2;
		d.breed = "Rajapalium";
		System.out.println("Name of the dos is: " +d.name);
		System.out.println("Color of the dos is: " +d.color);
		System.out.println("Cost of the dos is:" +d.cost);
		System.out.println("Age of the dos is: " +d.age);
		System.out.println("Breed of the dos is:" +d.breed);

		d.eat();
		d.bark();
		d.run();
		
		
		Dog d1 = new Dog();
		System.out.println("The address of the dog d is: " +d);
		
		d1.name = "Tipu";
		d1.color = "Red";
		d1.cost = 2000;
		d1.age = 2;
		d1.breed = "dzgdagl";
		System.out.println("Name of the dos is: " +d1.name);
		System.out.println("Color of the dos is: " +d1.color);
		System.out.println("Cost of the dos is:" +d1.cost);
		System.out.println("Age of the dos is: " +d1.age);
		System.out.println("Breed of the dos is:" +d1.breed);

		d1.eat();
		d1.bark();
		d1.run();

		/*

			Byte byt = new Byte(10);
			Short s = new Short(10);
			Integer i = new Integer(10);
			Long l = new Long(10);
			Float f = new Float(10.0f);
			Double dbl = new Double(10.00);
			Character cr = new Character('s');
			String st = new String("dbv");
			
			*/
	}

}
