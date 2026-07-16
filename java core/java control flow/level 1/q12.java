import java.util.*;
public class q12 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sumUsingLoop = 0;
            int i = 1;

            while (i <= n) {
                sumUsingLoop += i;
                i++;
            }

            int sumUsingFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumUsingLoop);
            System.out.println("Sum using formula: " + sumUsingFormula);

            if (sumUsingLoop == sumUsingFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Mismatch in results.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}