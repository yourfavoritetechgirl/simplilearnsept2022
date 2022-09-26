package myPackage;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating String Buffer");
		//create a string buffer and use append method
		StringBuffer s=new StringBuffer("Welcome to Java! ");
		s.append("Enjoy your Learning! ");
		System.out.println(s);
		
		//insert method
		s.insert(0, "Hey Folks, ");
		System.out.println(s);
		
		//replace
		s.replace(0, 3, "Hello");
		System.out.println(s);
		
		//delete
		s.delete(0, 10);
		System.out.println(s);

	}

}
