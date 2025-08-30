package java core.Java String.Level 1;

public class q6 {
      public static void generateException() {
        String text = "Java";
        System.out.println(text.substring(3, 1)); // start > end
    }

    public static void handleException() {
        try {
            String text = "Java";
            System.out.println(text.substring(3, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }

}
