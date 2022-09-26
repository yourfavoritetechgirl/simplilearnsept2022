import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//Write a Java program to solve quadratic equations (use if, else if and else)
public class QuadraticEquations {
    public static void main(String[] args){
        int a =1, b=5, c=1;
        double x = (-b)+sqrt((2*2)-(4*a*c));
        double y = (-b)-sqrt((2*2)-(4*a*c));
        double p = x/(2*a);
        double q = y/(2*a);

        System.out.println("The roots are : "+ p + " and "+ q );


    }

}
