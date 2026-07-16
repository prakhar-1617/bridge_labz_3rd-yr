import java.util.*;
public class q10 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        int[] freq = new int[10];
        for (char c : num.toCharArray()) {
            if (Character.isDigit(c)) {
                freq[c - '0']++;
            }
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}
