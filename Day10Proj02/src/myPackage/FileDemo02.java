package myPackage;
import java.io.*;
import java.io.FileOutputStream.*;
public class FileDemo02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data="Hey Folks, We are discussing FileOutputStream class";
		FileOutputStream obj=new FileOutputStream("C:\\Users\\savyatag\\OneDrive - AMDOCS\\Backup Folders\\Desktop\\JFSD Course\\2-Implement OOPS using JAVA with Data Structures and Beyond");
		obj.write(data.getBytes());
		obj.close();
		System.out.println("Data written onto the file");
	}

}
