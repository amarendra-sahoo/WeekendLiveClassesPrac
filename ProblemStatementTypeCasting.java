package com.TwentyThird.April;

//Live Virtual Class Curriculum
//1.1.1 Writing a program in Java to implement implicit and explicit type casting
//1.1.2 Executing the program and verifying how the conversion of data types happen
//1.1.3 Pushing the code to your GitHub repositories

public class ProblemStatementTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Implicit type casting");
		char a = 'A';
		System.out.println("Value of char a is : " +a);
		int b = a;
		System.out.println("Value of int b is : " +b);
		float c =a;
		System.out.println("Value of float c is : " +c);
		long d =a;
		System.out.println("Value of long d is : " +d);
		double e =a;
		System.out.println("Value of double e is : " +e);
		
		System.out.println("\n");
		System.out.println("Explicit type casting");
		double x = 45.75;
		int y = (int)x;
		System.out.println("Value of x is :" +x);
		System.out.println("Value of y is :" +y);		
		
	}

}
