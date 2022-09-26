package myPackage;
import java.util.*;
class Matrix{
	int arr[][];
	int r, c;
	Matrix(int r, int c){
		this.r=r;
		this.c=c;
		arr=new int[r][c];
	}
	
	//accept 2D array from the keyboard and return it
	public int[][] getMatrix() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	
	public int[][]findSum(int a[][],int b[][]){
		int[][] temp = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				temp[i][j]=a[i][j]+b[i][j];
			}
		}
		return temp;
	}
	
	//display the resultant 2D array as matrix
	public void displayMatrix(int[][] res) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println(res[i][j]+ "   ");
			}
			System.out.println();
		}
	}
	
}
public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create 2 objects to matrix class, since each object contains and array
		Matrix obj1=new Matrix(3,3);
		Matrix obj2=new Matrix(3,3);
		
		//take 3 references for 2D array
		int x[][],y[][],z [][];
		System.out.println("\nEnter elements for first matrix: ");
		x=obj1.getMatrix();
		System.out.println("\nEnterelements for second matrix: ");
		y=obj2.getMatrix();
		
		//add the matrices and return sum matrix into z
		z=obj1.findSum(x, y);
		System.out.println("\nThe sum matrix is: ");
		

	}

}
