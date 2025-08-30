package java core.Java String.Level 1;

public class q7 {
       public static void generateException() {
        String text = "Hello";
        int num = Integer.parseInt(text); // Not a number
    }

    public static void handleException() {
        try {
            String text = "Hello";
            int num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
