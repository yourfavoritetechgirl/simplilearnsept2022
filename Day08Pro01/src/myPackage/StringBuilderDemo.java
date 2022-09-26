package myPackage;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating StringBuilder");
		StringBuilder sb = new StringBuilder("Happy");
		sb.append("Learning");
		System.out.println(sb);
		
		//delete
		System.out.println(sb.delete(0, 2));
		
		//insert
		System.out.println(sb.insert(0, "Simplilearn"));
		
		System.out.println(sb.reverse());
		

	}

}
