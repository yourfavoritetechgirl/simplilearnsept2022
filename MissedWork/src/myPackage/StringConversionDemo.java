package myPackage;

public class StringConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Conversion of String to StringBuffer and StrngBuilder. ");
		String str="Hello";
		
		//Conversion of String object to StringBuffer
		StringBuffer sbr=new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);
		
		//Conversion of String object to StringBuilder
		StringBuilder sbl=new StringBuilder(str);
		sbl.append(" World");
		System.out.println("String to StringBuilder. ");
		System.out.println(sbl);
		
		

	}

}
