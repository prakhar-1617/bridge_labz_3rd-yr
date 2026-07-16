import java.util.*;
public class q8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number > 0) {
            int i = 1;
            System.out.println("Factors of " + number + ":");
            while (i <= number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        } else {
            System.out.println("Enter a positive integer.");
        }
    }
}
