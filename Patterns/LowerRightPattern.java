public class LowerRightPattern {

    public static void main(String[] args) {

        // #3: How to create a lower right staircase Pattern
        // explaination: row and star ka column banao, dono ka addition is N+1, isliye
        // star = N+1-row
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) { // idhar j bhi 1 se shuru hora hai, isliye ++
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
