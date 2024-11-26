//Take an input from User in the form of String and reverse.
import java.util.*;
public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //1st Solution:
        // String rev = "";
        // for (int i=name.length()-1; i>=0;i--){
        //     rev +=name.charAt(i);
        // }
        // System.out.println(rev);

        //2nd Solution
        // StringBuilder sb = new StringBuilder(name);
        // System.out.println(sb.reverse().toString());


    }
}