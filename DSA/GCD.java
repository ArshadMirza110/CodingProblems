import java.util.*;
public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rem=0;
        while(n1%n2 !=0){
            rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        int GCD = rem;
        System.out.println("The Greatest common divisor is "+ GCD);
    }
}
// 1.n1 % n2 karenge jo reminder aaya wo n2 banjaega aur n1 purana wala n2, jab tak rem =0