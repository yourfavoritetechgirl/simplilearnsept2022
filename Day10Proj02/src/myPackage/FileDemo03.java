package myPackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileDemo03 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String data="Data related to File NIO";
		Files.write(Paths.get("C:\\Users\\savyatag\\Desktop\\JFSD Course\\2-Implement OOPS using JAVA with Data Structures and Beyond"), data.getBytes());
		List<String> lines=Arrays.asList("this is line 1","this is line2");
		Files.write(Paths.get("MyNewFile.txt"), lines, StandardCharsets.UTF_8);
	}

}
