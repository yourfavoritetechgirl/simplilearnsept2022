package myPackage;

//thread unsafe - two threads acting on same object
class Reserve implements Runnable{

	//available berths are 1
	int available=1;
	int wanted;
	
	//accept wanted berths
	Reserve(int i){
		wanted=i;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Avilable Berths: "+available);
		if(available>=wanted) {
			//get the passenger name
			String name=Thread.currentThread().getName();
			//allot the berth to him
			System.out.println(wanted+" Berths reserved for "+name);
			try {
				Thread.sleep(2000);//wait for printing the ticket
				available=available-wanted;
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
			//if available berths are less, display sorry
			else
				System.out.println("Sorry, no berths ");
		}
			
	}

public class unsafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tell that 1 berth is needed
		Reserve obj=new Reserve(1);
		
		//attach first thread to the object
		Thread t1=new Thread(obj);
		//attach second thread to the object
		Thread t2=new Thread(obj);
		
		//take the thread names as a person names
		t1.setName("First Person");
		t1.setName("Second Person");
		
		//send the request for berth
		t1.start();
		t2.start();

	}

}
