package myPackage;

import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht =new Hashtable<Integer, String>();
		ht.put(501, "Alex");
		ht.put(502,"Raj" );
		ht.put(503,"Puja" );
		ht.put(504,"Mendu" );
		ht.put(502,"Krish" );
		System.out.println("The eleents of the HashTable: ");
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+"    "+m.getValue());
		}

	}

}
