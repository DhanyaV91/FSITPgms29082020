package day1;

import java.util.Scanner;

/*
 * This program demonstrates Ternary Operator
 * 
*/

public class TernaryOperator {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first value:");
		num1 = s.nextInt();
		System.out.println("Enter the first value:");
		num2 = s.nextInt();		
		s.close();
		
		int temp;
		
		temp=(num1<num2)? (num1+=50) : (num2-=50); //ternary operator
		System.out.println("num1 =" + num1);
		System.out.println("num2 =" + num2);
		System.out.println("temp =" + temp);		
	}

}
