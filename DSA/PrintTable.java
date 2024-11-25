Problem Description
Take a number A as input, print its multiplication table having the first 10 multiples.

Problem Constraints
1 <= A <= 1000

Input Format
First line contains a single integer A.

Output Format
Print 10 lines, ith line containing ith multiple.

import java.util.*;
public class PrintEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(N+"X"+i+"="+i*N);
        }


    }
}

