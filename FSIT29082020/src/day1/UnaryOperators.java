package day1;

import java.util.Scanner;

/*
 * This program demonstrates Unary Operators given below:
 * ++, --
 * This is also called as Pre-Increment/Pre-Decrement or Post-Increment/Post-Decrement
 * pre increment/decrement the value will be incremented/decremented the new value will be available on the same line
 * post increment/decrement the vaue will be incremented/decremented but the new value will be available from next line.  
*/

public class UnaryOperators {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value:");
		n = s.nextInt();
		s.close();
		
		System.out.println("Post Increment value is:" + (n++));// n=n+1--> n=11..incremented value will be available from next line.
		System.out.println("Pre Increment value is:" + (++n));//n=n+1--> n=12..increments the value and new value will be available on the same line.	
		System.out.println("Post Decrement value is:" + (n--));//n=n-1--> n=11..decremented value will be available for the next line.	
		System.out.println("Pre Decrement value is:" + (--n));//n=n-1--> n=10..decremented value will be available on the same line.
		
		System.out.println(n++ + ++n + --n);// 10+12+11=33
	}

}
