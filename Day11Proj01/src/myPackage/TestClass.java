package myPackage;

interface First{
	default void Show() {
		System.out.println("Default First");
	}
}
interface Second{
	default void Show() {
		System.out.println("Default Second");
	}
}
public class TestClass implements First,Second{
	public void Show() {
		First.super.Show();
		Second.super.Show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass obj=new TestClass();
		obj.Show();

	}

}
