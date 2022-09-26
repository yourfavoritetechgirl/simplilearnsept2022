package myPackage;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(101, "Java FSD");
		hm.put(102, "Python");
		hm.put(103, "DevOps");
		
		System.out.println("The elements of the HashMap are: ");
		System.out.println(hm);
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+ "   "+ m.getValue());
		}

	}

}
