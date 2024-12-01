public class CheckSortedArray {
    public static void main(String[] args) {
        int [] A = {1,2,10,4,5,6};
        boolean isSorted = true;
        for (int i=0;i<A.length-1;i++){
            if (A[i]>A[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Sorted Arrray");
        }
        else{
            System.out.println("Not a Sorted Array");
        }
    }
}
