import java.util.*;
public class q1 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10], service = new double[10], bonus = new double[10], newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i = 0; i < 10; i++) {
            double s, y;
            while (true) {
                s = sc.nextDouble();
                y = sc.nextDouble();
                if (s > 0 && y >= 0) break;
            }
            salary[i] = s;
            service[i] = y;
        }
        for (int i = 0; i < 10; i++) {
            bonus[i] = service[i] > 5 ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
    }
    
}
