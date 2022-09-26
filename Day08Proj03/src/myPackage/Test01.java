package myPackage;


//let the class extends Thread class
class MyThread extends Thread{
	//write the run method inside the class
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object to MyThread class
		MyThread obj=new MyThread();
		
		//create a thread class object and attach it to the objects of MyThread class
		Thread t=new Thread(obj);
		
		//now run the thread from the object
		t.start(); //this will execute the code under run() method
		

	}

}
