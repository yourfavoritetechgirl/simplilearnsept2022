package myPackage;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating String Buffer");
		
		//Create a string buffer and use append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy you Learning!");
		System.out.println(s);
		
		//insert method
		s.insert(0, "Hey Folks,");
		System.out.println(s);
		
		//replace
		s.replace(0, 3, "Hello");
		System.out.println(s);

	}

}
