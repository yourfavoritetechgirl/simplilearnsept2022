package myPackage;

import java.util.Scanner;

public class QuizProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Created Scanner object here
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		//Displaying the set of quiz options
		System.out.println("Who is the founder of Blue Origin? ");
		System.out.println("1. Bil Gates\n2. Tim Cook\n3. Nadella\n4. Jeff Bezos");
		System.out.println("Enter your choice (1/2/3/4)?");
		int n=sc.nextInt();
		
		//validating user choices
		if(n==4) {
			System.out.println("Congratulations!! You have guessed the correct answer. ");
		}else if( n==5 ) {
			break;
		}
		
		else {
			System.out.println("Wrong Choice. Please try again");
		}
		}

	}

}
