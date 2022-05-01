package com.TwentyThird.April;

//Live Virtual Class Curriculum
//1.2.1    Writing a program in Java to implement access modifiers
//1.2.2    Executing the program and verifying how the access modifiers work
//1.2.3    Pushing the code to your GitHub repositories
class defDfltAccessSpecifier{
	
	void display() {
	System.out.println("we are using Default Access Specifier");
	}

}
 class defProtAccessSpecifier{
	
	protected void display() {
	System.out.println("we are using Protected Access Specifier");
	}

}
class defPvtAccessSpecifier{
	//The method display() from the type defPvtAccessSpecifier is never used locally
	private void display() {
	System.out.println("we are using Private Access Specifier");
	}

}
public class AccessSpecifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------");
		System.out.println("Default Access Specifier");
		defDfltAccessSpecifier objOne = new defDfltAccessSpecifier();
		objOne.display();
		System.out.println("Protected Access Specifier");
		defProtAccessSpecifier objTwo = new defProtAccessSpecifier();
		objTwo.display();
		System.out.println("Private Access Specifier; not able to access the private method!");
		System.out.println("The method display() from the type defPvtAccessSpecifier is never used locally");
		defPvtAccessSpecifier  objThree = new defPvtAccessSpecifier();
		//objThree.display();
		
		
		
	}

}
