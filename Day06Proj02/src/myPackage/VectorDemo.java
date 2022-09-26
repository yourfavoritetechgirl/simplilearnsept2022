package myPackage;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(10);
		v.add(15);
		v.add(25);
		v.add(35);
		v.add(1,12);
		v.addElement(45);
		System.out.println(v);
		
		//removing 1 element from vector
		v.remove(2);
		System.out.println("After removing: "+v);
		
		
		}
		
		
	}

