import java.util.*;

public class q10 {
      public static String convertToUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase using ASCII difference
            }
            upperCaseText.append(ch);
        }
        return upperCaseText.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String manualUpper = convertToUpperCase(text);

        String builtInUpper = text.toUpperCase();

        boolean isSame = compareStrings(manualUpper, builtInUpper);

        System.out.println("\nOriginal Text: " + text);
        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}
