package myPackage;

public class Dog {
	
	String name;
	String breed;
	int age;
	String color;
	public Dog(String name, String breed, int age, String color) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public String getBreed() {
		return breed;
	}


	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "Hi my name is "+this.getName()+"\nMy breed, age and color are "
	+this.getBreed()+","+this.getAge()+" and "+this.getColor();
	}


	public String getColor() {
		return color;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog scott =new Dog("Scott","Papillon",5,"Black");
		System.out.println(scott.toString());

	}

}
