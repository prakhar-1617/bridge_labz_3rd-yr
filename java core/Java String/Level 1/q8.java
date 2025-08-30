package java core.Java String.Level 1;

public class q8 {
     public static void generateException() {
        String[] names = {"John", "Alice"};
        System.out.println(names[5]);
    }

    public static void handleException() {
        try {
            String[] names = {"John", "Alice"};
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
