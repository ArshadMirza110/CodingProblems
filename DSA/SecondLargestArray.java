import java.util.*;
;public class SecondLargestArray {
    public static void main(String[] args) {
        int [] A ={1,2,4,1,9,4,3,5};
        int size = A.length;
        Arrays.sort(A);
        for (int i=size-2; i>=0;i--){
            if (A[i]!=A[size-1]){
                System.out.println("The second largest is :"+A[i]);
            }
            else{
                System.out.println("There is no second largest");
            }
        }
    }
}
