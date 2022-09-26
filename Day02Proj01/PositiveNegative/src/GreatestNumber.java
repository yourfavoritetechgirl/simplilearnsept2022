public class GreatestNumber {
    public static void main(String[] args){
        int n1 = 25;
        int n2 = 78;
        int n3 = 87;

        if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " is greater than "+ n2 + " and "+ n3);
        }
        else if (n2 > n1 && n2 > n3){
            System.out.println(n2 + " is greater than "+ n1 + " and "+ n3);
        }
        else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is greater than " + n2 + " and " + n1);
        }
        else System.out.println("ERROR!!! Check your code!!!");
    }

}
