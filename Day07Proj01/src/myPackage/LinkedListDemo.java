package myPackage;

import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating Linked List: ");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Gagan");
		names.add("Prakash");
		names.add("Shristi");
		names.add(1, "aashish");
		System.out.println(names);
		names.addFirst("Akansha");
		names.addLast("Rushikesh");
		System.out.println(names);
		names.remove("Prakash");
		System.out.println(names);

	}

}
