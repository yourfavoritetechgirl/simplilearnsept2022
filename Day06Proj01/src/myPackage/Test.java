package myPackage;

import java.util.Scanner;

class Student{
	int[] marks=new int[5];
	public void getMarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of subjects: ");
		int n=sc.nextInt();
		System.out.println("Enter Subject Marks: ");
		for(int i=0;i<n;i++) {
			System.out.println("Subject "+ (i+1)+" marks:");
			//Scanner sc = new Scanner(System.in);
			marks[i]=sc.nextInt();
		}
	}
	public void displayMarks() {
		System.out.println("Printing Student Marks: ");
		for(int m:marks) {
			System.out.println(m+" ");
		}
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.getMarks();
		obj.displayMarks();

	}

}
