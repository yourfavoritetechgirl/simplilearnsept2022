package myPackage;

public class Current {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let us find the current thread");
		Thread t=Thread.currentThread();
		System.out.println("Current Thread: "+t);
		System.out.println("It's Name:"+t.getName());

	}

}
