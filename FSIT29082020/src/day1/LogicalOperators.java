package day1;

import java.util.Scanner;

/*
 * This program demonstrates Logical operators
 * &&, ||, ! 
 * && - AND - Compares 2 or more conditions and returns true if all the conditions return true. Even if one is false the result will be false
 * || - OR - Compares 2 or more conditions and returns true if any ONE condition returns true.
 * ! - NOT - Provides reverse of the condition satisfaction or not i.e returns true if condition is false and returns false if condition is true.
*/

public class LogicalOperators {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number one:");
		num1 = s.nextInt();
		System.out.println("Enter number second:");
		num2 = s.nextInt();
		System.out.println("Enter number third:");
		num3 = s.nextInt();
		s.close();
		
		System.out.println("&& Comparision: " + ((num1>num2)&&(num1<num3)&&(num2<num3)));
		System.out.println("|| Comparision: " + ((num1>num2)||(num1<num3)||(num2<num3)));
		System.out.println("! Comparision: " + !(num1<=num2));
	}

}
