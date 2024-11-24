public class RectangularPattern {

    public static void main(String[] args) {
        // #1: How to create a rectangular Pattern
        // N=5
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}