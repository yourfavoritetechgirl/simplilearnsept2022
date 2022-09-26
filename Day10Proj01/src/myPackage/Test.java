package myPackage;

class MyException extends Exception{
	public MyException (String s) {
		super(s);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("Custom exception related msg");
		}
		catch(MyException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}

	}

}
