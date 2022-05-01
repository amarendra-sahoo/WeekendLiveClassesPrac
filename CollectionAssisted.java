package com.FirstMay.Twentytwo;

import java.util.*;

public class CollectionAssisted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("\nCollections with fixed data....");
    ArrayList al = new ArrayList();
    al.add("SimplelEARN");
    al.add('c');
    al.add(10);
    al.add(10.45F);
    al.add(12345.67);
    System.out.println(al);
    
    System.out.println("\nCollections with specific data....(Generics..)");
    ArrayList<String> SAl = new ArrayList<String>();
    SAl.add("Full");
    SAl.add("Stack Developer");
    SAl.add("from ");
    SAl.add("Simple Learn");
    System.out.println(SAl);
    
    
    System.out.println("\n ************************************* Example of Vector **********************");
    //Create a vector  
    Vector<String> vec = new Vector<String>();  
    //Adding elements using add() method of List  
    vec.add("Tiger");  
    vec.add("Lion");  
    vec.add("Dog");  
    vec.add("Elephant");  
    //Adding elements using addElement() method of Vector  
    vec.addElement("Rat");  
    vec.addElement("Cat");  
    vec.addElement("Deer");  
    int i = vec.capacity(); 
    System.out.println("\n Capacity is : "+i);
    System.out.println("Elements are: "+vec);  
	}

}
