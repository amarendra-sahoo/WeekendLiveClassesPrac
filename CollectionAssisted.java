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

		vec.addElement("Rat");  
		vec.addElement("Cat");  
		vec.addElement("Deer"); 

		vec.addElement("Rat1");  
		vec.addElement("Cat2");  
		vec.addElement("Deer3");

		int i = vec.capacity(); 
		System.out.println("\n Capacity is : "+i);
		System.out.println("Elements are: "+vec);  

		System.out.println("\n ================ Example of Iterator ========================");  
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Simp");
		ll.add("Learn");
		ll.add("FSD");
		System.out.println("Elements are: "+ll); 
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println("Elements are: "+itr.next()); 

		}
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(345);
		hs.add(1);
		hs.add(79);
		hs.add(346);
		hs.add(8);
		hs.add(56);
		hs.add(9999);
		hs.add(67);
		hs.add(3);
		System.out.println("Elements are: "+hs); //Random order.

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(12);
		lhs.add(345);
		lhs.add(1);
		lhs.add(79);
		lhs.add(346);
		lhs.add(8);
		lhs.add(56);
		lhs.add(9999);
		lhs.add(67);
		lhs.add(3);
		System.out.println("Elements are: "+lhs); 	//same order as per insertion order



		// map
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		hm.put((-1),"Tim");    
		hm.put(2,"Mary");    
		hm.put(3,"Catie");   
		System.out.println("\nThe elements of Hashmap are ");  
		/*
		 * for(Object x : arr)
		 * 
		 * 
		 */


		for(Map.Entry m:hm.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		//HashTable
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		ht.put(4,"Ales");  
		ht.put(5,"Rosy");  
		ht.put(6,"Jack");  
		ht.put(7,"John");  
		System.out.println("\nThe elements of HashTable are ");  
		for(Map.Entry n:ht.entrySet()){    
			System.out.println(n.getKey()+" "+n.getValue());    
		}
		//TreeMap
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(9,"Carlotte"); 
		map.put(10,"Catie"); 
		map.put(8,"Annie");    



		System.out.println("\nThe elements of TreeMap are ");  
		for(Map.Entry l:map.entrySet()){    
			System.out.println(l.getKey()+" "+l.getValue());
			System.out.println("Hi.");    
		}
	}

}
