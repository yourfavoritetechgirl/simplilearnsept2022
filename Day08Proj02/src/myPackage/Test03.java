package myPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a pattern to be searched 
		Pattern p=Pattern.compile("java",Pattern.CASE_INSENSITIVE);
		
		//search the above pattern in the below string
		Matcher m=p.matcher("java is a java programming JaVA language JAVA");
		
		//finding string using find() method
		while(m.find()) {
			//print starting and ending indexes
			//of the pattern in the text
			System.out.println("Pattern found from "+m.start() +" to "+(m.end()-1));
		}

	}

}
