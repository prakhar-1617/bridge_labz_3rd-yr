// package java core.Arrays.Level 2;

// public class q9 {
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of students: ");
//         int n = sc.nextInt();
//         double[][] marks = new double[n][3];
//         double[] percentage = new double[n];
//         String[] grade = new String[n];

//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter marks for Student " + (i + 1) + ":");
//             for (int j = 0; j < 3; j++) {
//                 double val;
//                 while (true) {
//                     val = sc.nextDouble();
//                     if (val >= 0 && val <= 100) break;
//                     System.out.println("Invalid marks. Enter again:");
//                 }
//                 marks[i][j] = val;
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             double total = marks[i][0] + marks[i][1] + marks[i][2];
//             percentage[i] = total / 3;
//             if (percentage[i] >= 90) grade[i] = "A+";
//             else if (percentage[i] >= 80) grade[i] = "A";
//             else if (percentage[i] >= 70) grade[i] = "B";
//             else if (percentage[i] >= 60) grade[i] = "C";
//             else if (percentage[i] >= 50) grade[i] = "D";
//             else grade[i] = "F";
//         }

//         System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
//         for (int i = 0; i < n; i++) {
//             System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f%%\t\t%s\n", i + 1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
//         }
//     }
    
// }
