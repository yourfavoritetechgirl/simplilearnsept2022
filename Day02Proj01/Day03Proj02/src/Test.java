
class Student{
    public void methodOne(){
        System.out.println("No parameter and no return type");
    }
    public void methodTwo(int a,int b){
        System.out.println("with 2 parameters and no return type");
        System.out.println(a+b);
    }
    public int methodThree(){
        System.out.println("Method with no parameters and has a return type.");
        return 10;
    }
    public int methodFour(int a, int b){
        System.out.println("method with parameters and return type. ");
        return a+b;
    }

}

public class Test {
    public static void main(String[] args){
        Student s=new Student();
        s.methodOne();
        s.methodTwo(5,10);
        System.out.println(s.methodThree());
        int res=s.methodFour(20, 30);
        System.out.println(res);
        s.methodThree();
    }
}
