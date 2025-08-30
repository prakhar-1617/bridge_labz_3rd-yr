package java core.Java String.Level 1;

public class q4 {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Causes NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see abrupt termination
        handleException();
    }
  
}
