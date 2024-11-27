import java.util.*;
public class ReverseInteger {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = Integer.toString(N);
    StringBuilder sb = new StringBuilder(S);
    String rev = sb.reverse().toString();
    System.out.println(rev);
    }
}
// How to convert int to String ---> Integer.toString()
