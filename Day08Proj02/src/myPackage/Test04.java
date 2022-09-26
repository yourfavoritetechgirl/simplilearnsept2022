package myPackage;

import java.util.regex.*;
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattern="[a-z]+";
		String check="Regular Expressions ARe useFul iN PaTTerN MatChiNG";
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(check);
		
		while(m.find()) {
			System.out.println(check.substring(m.start(),m.end()));
		}

	}

}
