import java.util.*;
public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int sum =0;
        for (int i=0;i<N.length();i++){
            sum += Character.getNumericValue(N.charAt(i));
        }
        System.out.println(sum);
    }
}

//Isme humne ye seekha ke String me input lena hai aur usko sum me store karna hai
// N.charAt(i) hamesha char value return karega isliye method karenge with
//Character.getNumericValue()......Method hai yaad rakhna
