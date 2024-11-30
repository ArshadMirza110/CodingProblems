public class MaxMinArray {
    public static void main(String[] args) {
        int A[]={1,2,4,6,7,3,6};
        int max = A[0];
        int min = A[0];
        for (int i=0;i<A.length;i++){
            if (A[i]>max){
                max = A[i];
            } 
        }
        for (int i=0;i<A.length;i++){
            if (A[i]<min){
                min = A[i];
            } 
        }
        System.out.println(max);
        System.out.println(min);
    }
}
