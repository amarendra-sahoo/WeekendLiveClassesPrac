package com.Thirty.April;

public class LaunchDog {

	public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.disp();
        System.out.println("-----------------");
        Dog d2 = new Dog("Rocky");
        d2.disp();
        System.out.println("-----------------");
        Dog d3 = new Dog("Tommy",5000);
        d3.disp();
        System.out.println("-----------------");
        Dog d4 = new Dog("Jimmy", 7000, "white");
        d4.disp();
        System.out.println("-----------------");
        Dog d5 = new Dog("Jerry", 8000, "gold", "GR");
        d5.disp();
    }
}
