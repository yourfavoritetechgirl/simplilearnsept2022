package myPackage;

public class Outer2 {
	
	private String msg="Hey Folks, Welcome to Inner Classes";
	
	void display() {
		class Inner{
			void msg() {
				System.out.println(msg);
			}
		}
		
		Inner in =new Inner();
		in.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 obj=new Outer2();
		obj.display();
		

	}

}
