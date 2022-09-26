public class Customer {
    Customer(){
        System.out.println("Default Constructor");
    }
    public void myMethod(){
        System.out.println(" My Method ");
    }
    public static void main(String[] args){
        Customer c1=new Customer();
        Customer c2=new Customer();
        Customer c3= new Customer();
        c1.myMethod();

    }

}
