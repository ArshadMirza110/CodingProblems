class ReverseArray{
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int i=0; int j= A.length-1;
        while (i<j){
       
            int temp = A[i];
            A[i]= A[j];
            A[j] = temp;
            i++;
            j--;
        }
        for (int x:A){
            System.out.print(x+" ");
        }
    }
}