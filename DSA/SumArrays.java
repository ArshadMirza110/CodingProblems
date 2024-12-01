public class SumArrays {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int sum =0;
        for (int x:A){
            sum+=x;
        }
        System.out.println(sum);
        ////////////////////////////
        int avg = sum/A.length;
        System.out.println(avg);
    }
}
