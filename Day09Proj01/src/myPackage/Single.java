package myPackage;

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//execute the tasks one by one by calling the methods
		task1();
		task2();
		task3();
		
	}
	
	void task1() {
		System.out.println("This is task 1");
	}
	
	void task2() {
		System.out.println("This is task 2");
	}
	
	void task3() {
		System.out.println("This is task 3");
	}
	
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object to MyThread class
		MyThread obj = new MyThread();
		//Create a thread t1 and attach it to that object
		Thread t1=new Thread(obj);
		//execute the thread t1 on the object's run() method
		t1.start();

	}

}
