package com.TwentyThird.April;
import java.util.Scanner;

class Calculator{
    void operations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num-1");
        int num1 = sc.nextInt();
        System.out.println("enter the num-1");
        int num2 = sc.nextInt();
        
        System.out.println("Enter your choice\n 1.Addition \n 2.Sutraction \n 3.Multiplication \n 4.Division\n 5. Modulus \n 6. Percentage \n 7.Exit");
        int n = sc.nextInt();
        
        if(n==1) {
            int addition = num1+num2;
            System.out.println("The addition result is: "+addition);
        }
        else if(n==2) {
            int subtraction = num1-num2;
            System.out.println("The subtraction result is: "+subtraction);
        }
        else if(n ==3) {
			System.out.println("Your Multiplication result is : --" + (num1*num2) );
		}
		else if (n ==4) {
			System.out.println("Your Division result is : --" + (num1/num2) );
		}
		else if (n ==5) {
			System.out.println("Your Module result is : --" + (num1%num2) );
		}
		else if (n ==6) {
			System.out.println("Your Percentage result is : --" + (num1/num2 * 100)+ "%" );
		}

        else {
            System.exit(0);
        }
    }
}

public class ArithmaticCalcUsingObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Calculator c = new Calculator();
        for(; ;) //infinite loop
        {
            c.operations();
        }
	}

}
