package myPackage;
import java.util.*;
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Methods of String");
		String s1=new String("Hello World");
		
		//Substring
		System.out.println(s1.length());
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));
		
		//String Comparison
		String s2="Hello";
		String s3="Hello";
		System.out.println(s2.compareTo(s3));
		
		//isEmpty
		String s4="";
		System.out.println(s4.isEmpty());
		
		//toLowerCase
		String s5="HElLo";
		System.out.println(s5.toLowerCase());
		
		//replace
		String s6="Heldo";
		String replace = s6.replace('d', 'l');
		System.out.println(replace);
		
		//equals
		String x = "Welcome to Java";
		String y = "WelCOME to jAvA";
		System.out.println(x.equals(y));
		System.out.println(x.equalsIgnoreCase(y));

	}

}
