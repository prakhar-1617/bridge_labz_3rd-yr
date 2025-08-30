package java core.Java String.Level 1;

public class q5 {
      public static void generateException() {
        String text = "Hello";
        System.out.println(text.charAt(10)); // Out of bounds
    }

    public static void handleException() {
        try {
            String text = "Hello";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }

}
