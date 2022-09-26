package myPackage;

class MyThread1 implements Runnable{
	String str;
	MyThread1(String str){
		this.str=str;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(str+"       "+i);
			try {
				Thread.sleep(2000);
				//cease thread execution for 2000 milliseconds
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	}
}

public class Theatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create two objects to represent two tasks
		MyThread1 obj1=new MyThread1("Cut the ticket");
		MyThread1 obj2=new MyThread1("Show the seat");
		
		//create two threads and attach them to the two objects
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		//start the threads
		t1.start();
		t2.start();		
		

	}

}
