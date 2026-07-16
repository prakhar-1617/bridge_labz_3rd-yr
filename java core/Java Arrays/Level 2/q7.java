// package java core.Arrays.Level 2;

// public class q7 {
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of persons: ");
//         int n = sc.nextInt();
//         double[][] personData = new double[n][3];
//         String[] weightStatus = new String[n];

//         for (int i = 0; i < n; i++) {
//             double weight, height;
//             while (true) {
//                 System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
//                 weight = sc.nextDouble();
//                 System.out.print("Enter height (m) for person " + (i + 1) + ": ");
//                 height = sc.nextDouble();
//                 if (weight > 0 && height > 0) break;
//                 System.out.println("Invalid input. Enter positive values.");
//             }
//             personData[i][0] = weight;
//             personData[i][1] = height;
//             double bmi = weight / (height * height);
//             personData[i][2] = bmi;

//             if (bmi < 18.5) weightStatus[i] = "Underweight";
//             else if (bmi < 24.9) weightStatus[i] = "Normal";
//             else if (bmi < 29.9) weightStatus[i] = "Overweight";
//             else weightStatus[i] = "Obese";
//         }

//         System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
//         for (int i = 0; i < n; i++) {
//             System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
//         }
// }
