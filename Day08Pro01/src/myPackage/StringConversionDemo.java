package myPackage;

public class StringConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Conversion of String to StringBuffer and StringBuilder");
		String str="Hello";
		
		//Conversion of String object to StringBuffer
		StringBuffer sbr=new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);
		
		//Conversion from String object to StringBuilder
		StringBuilder sb1 =new StringBuilder(str);
		sb1.append("world");
		System.out.println("String to StringBuilder");
		System.out.println(sb1);
		

	}

}
