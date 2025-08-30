// package java core.Arrays.Level 2;

// public class q8 {
//       public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of students: ");
//         int n = sc.nextInt();

//         int[][] marks = new int[n][3]; // 3 s
//                 double[] percentage = new double[n];
//         char[] grade = new char[n];

//         for (int i = 0; i < n; i++) {
//             System.out.println("\nEnter marks of Student " + (i + 1) + " (Physics, Chemistry, Maths): ");
//             for (int j = 0; j < 3; j++) {
//                 int m;
//                 while (true) { 
//                              m = sc.nextInt();
//                     if (m >= 0 && m <= 100) break;
//                     System.out.println("Invalid marks! Enter again (0-100 only): ");
//                 }
//                 marks[i][j] = m;
//             }

//             int total = marks[i][0] + marks[i][1] + marks[i][2];
//             percentage[i] = total / 3.0;

//             if (percentage[i] >= 80) {
//                 grade[i] = 'A';
//             } else if (percentage[i] >= 70) {
//                 grade[i] = 'B';
//             } else if (percentage[i] >= 60) {
//                 grade[i] = 'C';
//             } else if (percentage[i] >= 50) {
//                 grade[i] = 'D';
//             } else if (percentage[i] >= 40) {
//                 grade[i] = 'E';
//             } else {
//                 grade[i] = 'R'; 
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             System.out.println("Student " + (i + 1) + ":");
//             System.out.println("Physics Marks = " + marks[i][0]);
//             System.out.println("Chemistry Marks = " + marks[i][1]);
//             System.out.println("Maths Marks = " + marks[i][2]);
//             System.out.println("Percentage = " + String.format("%.2f", percentage[i]) + "%");
//             System.out.println("Grade = " + grade[i]);
//         }

//         sc.close();
//     }

// }
