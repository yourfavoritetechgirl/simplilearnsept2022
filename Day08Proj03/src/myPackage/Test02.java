package myPackage;

import java.io.IOException;

//let the class extends Thread class
class MyThread1 extends Thread{
	
	boolean stop =false;
	//write the run method inside the class
	public void run() {
		for(int i=1;i<=100000000;i++) {
			System.out.println(i);
			
		}
	}
}


public class Test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create an object to MyThread class
		MyThread1 obj=new MyThread1();
		
		//create a thread class object and attach it to the objects of MyThread class
		Thread t=new Thread(obj);
		
		//now run the thread on the object
		t.start();
		
		System.in.read();
		obj.stop=true;

	}

}
