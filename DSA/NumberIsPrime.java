import java.util.*;
public class NumberIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        for (int i=1;i<=N;i++){
            if (N%i==0){
                // System.out.println(i);
                count++;
            }
        }
        if(count==2){
            System.out.println("Input is Prime");
        }
        else{
            System.out.println("Input is not a Prime");
        }

    }
}
