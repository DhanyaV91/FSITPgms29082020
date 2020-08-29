package day1;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1 = scan.nextInt();
		System.out.println("Enter the second number:");
		num2 = scan.nextInt();
		scan.close();
	
		System.out.println("Num1 < Num2" + (num1<num2));
		System.out.println("Num1 <= Num2" + (num1<=num2));
		System.out.println("Num1 > Num2" + (num1>num2));
		System.out.println("Num1 >= Num2" + (num1>=num2));
		//System.out.println("Num1 <> Num2" + (num1<>num2));
		System.out.println("Num1 != Num2" + (num1!=num2));
	}

}
