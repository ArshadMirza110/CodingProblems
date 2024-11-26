public class Palindrome {
    public static void main(String[] args) {
        String name = "racecar";

        StringBuilder sb = new StringBuilder(name);

        String revString = sb.reverse().toString(); //reverse the String and save in new String

        if (revString.equals(name)) {//we cannot compare sb and name, since sb is Stringbuilder and name is String
            System.out.println("palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
}
