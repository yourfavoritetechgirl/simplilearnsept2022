package myPackage;

//multiple inheritance using interfaces
interface Father{
	float HT=6.2f;
	void height();
}

interface Mother{
	float HT=5.8f;
	void height();
}

class Child implements Father,Mother{

	@Override
	public void height() {
		// TODO Auto-generated method stub
		//child got the average height of its parents
		float ht=(Father.HT+Mother.HT)/2;
		System.out.println("Child's Height:"+ht);
		
	}
	
}
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();
		ch.height();

	}

}
