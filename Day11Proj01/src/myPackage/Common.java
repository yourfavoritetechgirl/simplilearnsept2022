package myPackage;

class MyClass{
	void calculate(double x) {
		System.out.println("Square:"+(x*x));
	}
}

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create three objects
		MyClass obj1=new MyClass();
		MyClass obj2=new MyClass();
		MyClass obj3=new MyClass();
		
		//call calculate() method from the objects
		obj1.calculate(3);
		obj1.calculate(4);
		obj3.calculate(5);

	}

}
