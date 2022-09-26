package myPackage;

import java.io.*;
public class LinkedList {
	
	Node head;//head of list
	static class Node{
		int data;
		Node next;
		Node (int d){
			data=d;
			next=null;
		}
	}
	//method to insert new node
	public static LinkedList insert(LinkedList list, int data) {
		//create a new node with given data
		Node new_node=new Node(data);
		new_node.next=null;
		
		//if the linkedlist is empty, then make the new node as head
		if(list.head==null) {
			list.head=new_node;
		}
		else {
			//else traverse till the last node and insert the new_node there
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			//insert the new_node at last node
			last.next=new_node;
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
