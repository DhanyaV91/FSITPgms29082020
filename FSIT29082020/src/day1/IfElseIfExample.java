package day1;

import java.util.Scanner;

/*
 * This program demonstrates the If-Else-If example
 * Accept score of a student from console 
 * Declare the grade of student
 * score>=0 && score <50 --> Fail
 * score>=50 && score <70 --> "C Grade"
 * score>=70 && score <=100 --> "B Grade"
 * score not in the range of 0 - 100 then display "Invalid Score!"
*/

public class IfElseIfExample {

	public static void main(String[] args) {
		int score;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student's score:");
		score = s.nextInt();
		s.close();
		if(score>=0 && score <50){
			System.out.println("Sorry Failed!");
		}else if (score>=50 && score <70) {
			System.out.println("C Grade!");
		}else if(score>=70 && score <90){
			System.out.println("B Grade!");
		}else if(score>90 && score <=100) {
			System.out.println("A Grade!");
		}else{
			System.out.println("Invalid Scores given!");
		}
		
	}

}
