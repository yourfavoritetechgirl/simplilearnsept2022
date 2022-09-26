package myPackage;


abstract class AnonymousInnerClass{
	public abstract void display();
}
public class Outer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClass obj=new AnonymousInnerClass() {

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Inner Classes");
				
			}
			
		};
		obj.display();
		

	}

}
