package myPackage;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");
		al.add("Mango");
		al.add("Grapes");
		al.add("Oranges");
		
		//display content
		System.out.println("Contents: "+ al);
		
		//remove two objects
		al.remove(2);
		al.remove("Oranges");
		
		//display again
		System.out.println("Contents after removing "+ al);

		//extract elements using iterator
		System.out.println("Extracting using iterator");
		
		//add an iterator to ArrayList to retreive elements
		Iterator itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
