package myPackage;

public class Employee {
	int empno;
	String empname;
	double salary;
	String designation;

	public Employee(int empno, String empname, double salary, String designation) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEmpname() {
		return empname;
	}

	public double getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}
	
	@Override
	public String toString() {
		return "Employee [getEmpno()=" + getEmpno() + ", getEmpname()=" + getEmpname() + ", getSalary()=" + getSalary()
				+ ", getDesignation()=" + getDesignation() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee bill=new Employee(96785,"Bill",190000,"Software Engineer");
		System.out.println(bill.toString());

	}

}
