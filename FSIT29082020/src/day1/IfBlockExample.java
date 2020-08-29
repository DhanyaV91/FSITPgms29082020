package day1;

import java.util.Scanner;

/*
 * This program demonstrates the If - Else block
 * Accept a 4 digit number as year from console input
 * Check whether the given year is leap year or not
 * feb-29 days then it is leap year i.e 2020 is a leap year
 * (year%400 == 0) || ((year%4 == 0) && (year%100 != 0)) 
*/

public class IfBlockExample {

	public static void main(String[] args) {
		int year;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year: ");
		year = s.nextInt();
		s.close();
		
		if((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))){
			System.out.println("The year is leap year!");
		}else {
			System.out.println("The year is not a leap year!");
		}
	}

}
