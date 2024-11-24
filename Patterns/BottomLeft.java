public class BottomLeft {

    public static void main(String[] args) {
        // #5: How to create a bottom left staircase Pattern
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
