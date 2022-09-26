package myPackage;

import java.io.File;
public class FileDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj=new File("myseptfile.txt");
		//create file
		if(obj.createNewFile()) {
			System.out.println("File Created");
		}else {
			System.out.println("File ");
		}
		
		System.out.println("File Created");

	}

}
