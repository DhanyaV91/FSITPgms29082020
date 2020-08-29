package day1;

/*
 * This program demonstrates the Assignment Operators given below:
 * =, +=, -=, *=, /=
 */

public class AssignmentOperators {

	public static void main(String[] args) {
		int temp = 10;
		System.out.println("Temp Value: " + temp); // Value assigned to temp
		System.out.println("Result of += : " + (temp+=3)); // temp = temp + 3 ==> temp = 10 + 3 ==> 13
		System.out.println("Result of -= : " + (temp-=3)); // temp = temp - 3 ==> temp = 13 - 3 ==> 10
		System.out.println("Result of *= : " + (temp*=3)); // temp = temp * 3 ==> temp = 10 * 3 ==> 30
		System.out.println("Result of /= : " + (temp/=3)); // temp = temp / 3 ==> temp = 30 / 3 ==> 10
	}

}
