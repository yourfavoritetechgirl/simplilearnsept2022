package myPackage;
/*This program shows how to use wait and notify 
 * This is the most efficient way of thread communication
 */
class Producer extends Thread{
	//to add data we use String Buffer object
	StringBuffer sb;
	Producer(){
		sb=new StringBuffer();
	}
	public void run() {
		synchronized(sb) {
		//go on appending data(numbers to string buffer
		for(int i=1;i<=10;i++) {
			try {
				sb.append(i+":");
				Thread.sleep(2000);
				System.out.println("appending...");
			}
			catch(Exception e) {
				
			}
		}
		//data production is over, so notify to consumer thread
		sb.notify();
	}
	
}
}
class Consumer extends Thread{
	//create producer reference to refer to producer object 
	//from consumer class
	Producer prod;
	Consumer(Producer prod){
		this.prod=prod;
	}
	public void run() {
		synchronized(prod.sb) {
			//wait till a notification is received from the producer
			//there is no wastage of time of even a single millisecond
			
			try {
				prod.sb.wait();
			}
			catch(Exception e) {
				//when data production is over, display data of StringBuffer
				System.out.println(prod.sb);
			}
		}
	}
}

public class Communicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Producer produces some data which consumer consumes
		Producer obj1=new Producer();
		
		//Pass the producer object to consumer so that it is then available to consumer
		Consumer obj2=new Consumer(obj1);
		
		//Create 2 threads and attach to Producer and Consumer
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		//run the threads
		t2.start();//consumer waits
		t1.start();//Producer starts production

	}

}
