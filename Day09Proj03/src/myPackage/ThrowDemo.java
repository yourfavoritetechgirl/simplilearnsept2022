package myPackage;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45,b=0,rs;
		try {
			if(b==0) {
				throw(new ArithmeticException("Can't divide by zero"));
			}
			else {
				rs=a/b;
				System.out.println("The result is: "+rs);
			}
		}
		catch(ArithmeticException ex) {
			System.out.println("\n\tError:"+ex.getMessage());
		}
		System.out.println("\nEnd of Program");

	}

}
