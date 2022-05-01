package com.TwentyThird.April;

import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: --");
		int aNum1 = sc.nextInt();
		System.out.println("Enter the next number: --");
		int aNum2 = sc.nextInt();
		
		System.out.println("Enter your choice\n 1.Addition \n 2.Sutraction \n 3.Multiplication \n 4.Division\n 5. Modulus \n 6. Percentage \n 7.Exit");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Your addition result is : --" + (aNum1+aNum2) );
		}
		else if(n ==2) {
			System.out.println("Your Subtraction result is : --" + (aNum1-aNum2) );
		}
		else if(n ==3) {
			System.out.println("Your Multiplication result is : --" + (aNum1*aNum2) );
		}
		else if (n ==4) {
			System.out.println("Your Division result is : --" + (aNum1/aNum2) );
		}
		else if (n ==5) {
			System.out.println("Your Module result is : --" + (aNum1%aNum2) );
		}
		else if (n ==6) {
			System.out.println("Your Percentage result is : --" + (aNum1/aNum2 * 100)+ "%" );
		}
		else {
			System.exit(0);
		}
		

	}

}
