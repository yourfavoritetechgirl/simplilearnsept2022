package myPackage;

import java.util.Scanner;

public class ArrayDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[2][3];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array elements: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Printing Array elements: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}
