package com.TwentyThird.April;

import java.util.Scanner;


public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char operator;
	    Double number1, number2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Enter your choice\n 1.Addition \n 2.Sutraction \n 3.Multiplication \n 4.Division\n 5. Modulus \n 6. Percentage \n 7.Exit");
		
	    int oper = input.nextInt();

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (oper) {

	      // performs addition between numbers
	      case 1:
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case 2:
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case 3:
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case 4:
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

		      // performs division between numbers
		  case 5:
		        result = number1 % number2;
		        System.out.println(number1 + " % " + number2 + " = " + result);
		        break; 
		  case 6:
		        result = (number1 / number2)*100;
		        System.out.println(number1 + " % " + number2 + " = " + result +"%");
		        break; 
		        
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();


	}

}
