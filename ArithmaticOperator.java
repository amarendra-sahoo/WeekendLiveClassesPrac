package com.TwentyThird.April;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Program for Addition Operation
		System.out.println("Addition--");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: --");
		int aNum1 = sc.nextInt();
		System.out.println("Enter the next number: --");
		int aNum2 = sc.nextInt();
		int addRes = aNum1 + aNum2;
		System.out.println("Your addition result is : --" +addRes);
		// Program for Subtraction
		System.out.println("Subtraction--");
		System.out.println("Enter the first number: --");
		int sNum1 = sc.nextInt();
		System.out.println("Enter the next number: --");
		int sNum2 = sc.nextInt();
		int subRes = sNum1 - sNum2;
		System.out.println("Your Subtraction result is : --" +subRes);
		
		// Program for Multiplication Operation
		System.out.println("Multiplication--");
		System.out.println("Enter the first number: --");
		int mNum1 = sc.nextInt();
		System.out.println("Enter the next number: --");
		int mNum2 = sc.nextInt();
		int mulRes = mNum1 * mNum2;
		System.out.println("Your Multiplication result is : --" +mulRes);
		// Program for Division Operation
		System.out.println("Division--");
		System.out.println("Enter the first number: --");
		int dNum1 = sc.nextInt();
		System.out.println("Enter the next number: --");
		int dNum2 = sc.nextInt();
		int divRes = dNum1 / dNum2;
		System.out.println("Your Division result is : --" +divRes);
		// Program for Module Operation
		System.out.println("Module--");
		System.out.println("Enter the first number: --");
		int moNum1 = sc.nextInt();
		System.out.println("Enter the next number: --");
		int moNum2 = sc.nextInt();
		int modRes = moNum1 / moNum2;
		System.out.println("Your Module result is : --" +modRes);

	}

}
