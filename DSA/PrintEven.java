// Problem Description

// Write a program that takes a positive integer N as input from the user and prints all natural numbers from 1 to N, with each number followed by a space (including the last number).


// Problem Constraints
// 1 <= N <= 1000000


// Input Format
// A single line representing N


// Output Format
// N space separated integers from 1 to N, with each number followed by a space, including the last number.

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