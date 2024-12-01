public class OccurenceArray {
    public static void main(String[] args) {
        // int [] A ={1,2,3,2,4,5,2,3};
        // int count=0;
        // int check =2;
        // for (int x : A){
        // if (x==check){
        // count++;
        // }
        // }
        // System.out.println(count);

        String name = "ArshAd MirzA";
        char check = 'A';
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == check) {
                count++;
            }
        }
        System.out.println(count);

    }
}
