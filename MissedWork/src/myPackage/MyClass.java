package myPackage;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		try {
			a[10]=500;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds! ");
		}
		finally {
			System.out.println("The size of an array is "+a.length);
		}

	}

}
