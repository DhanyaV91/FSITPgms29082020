package day1;

import java.util.Scanner;

/*
 * This program demonstrates all the Arithmetic Operators
 * +,-,*,/,%
 */

public class ArithmeticOperators {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1 = scan.nextInt();
		System.out.println("Enter the second number:");
		num2 = scan.nextInt();
		scan.close();
		
		System.out.println("Addition of two numbers: " + (num1+num2));
		System.out.println("Subtraction of two numbers: " + (num1-num2));
		System.out.println("Multiplication of two numbers: " + (num1*num2));
		System.out.println("Quotient of two numbers: " + (num1/num2));
		System.out.println("Remainder of two numbers: " + (num1%num2));
		
		System.out.println("result: " + (10*10/5+3-1*4/2*3));
		
	}

}
