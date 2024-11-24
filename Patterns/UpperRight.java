public class Pattern {

    public static void main(String[] args) {        
//#2: How to create a upper right staircase Pattern
        // * 
        // *  * 
        // *  *  * 
        // *  *  *  * 
        // *  *  *  *  * (Note: Jitna row and utna hi stars hai, isliye j=1 lekin j<=i)
            for(int i=0;i<5;i++){
                for (int j=0;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println("");
            }
}
}