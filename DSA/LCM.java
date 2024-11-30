import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rem=0;
        int on1= n1; int on2=n2;
        while(n1%n2 !=0){
            rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        int GCD = rem;
        System.out.println("The Greatest common divisor is "+ GCD);

        int LCM = (on1*on2)/GCD;
        System.err.println("The Least Common Multiple is "+LCM);
    }
}
