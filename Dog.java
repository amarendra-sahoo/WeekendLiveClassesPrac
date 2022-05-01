package com.Thirty.April;

public class Dog extends Object {
	
	 //Properties
    String name;
    int cost;
    String color;
    String breed;
    public Dog() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Dog(String name) {
        super();
        this.name = name;
    }
    public Dog(String name,int cost) {
        super();
        this.name = name;
        this.cost = cost;
    }
    public Dog(String name, int cost, String color) {
        super();
        this.name = name;
        this.cost = cost;
        this.color = color;
    }
    public Dog(String name, int cost, String color,String breed) {
        super();
        this.name = name;
        this.cost = cost;
        this.color = color;
        this.breed = breed;
    }
    
  //Activity
    void run() {
        System.out.println("Dog runs");
    }
    void eat() {
        System.out.println("Dog eats");
    }
    void disp() {
        System.out.println(name);
        System.out.println(cost);
        System.out.println(color);
        System.out.println(breed);
    }


}


