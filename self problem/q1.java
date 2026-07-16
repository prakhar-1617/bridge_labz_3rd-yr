import java.util.*;
public class q1 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + si);
    }
    
}
