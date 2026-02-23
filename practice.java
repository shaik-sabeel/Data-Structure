
// // public class Practice {
// //     public static void main(String[] args) {
// //         int n = 5;
// //         for (int i = 0; i < n; i++) {
// //             for (int j = 0; j < n; j++) {
// //                 if (j == 0 || j == n - 1) {
// //                     System.out.print("*");
// //                 } else {
// //                     System.out.print("");
// //                 }
// //             }
// //             System.out.println();
// //         }
// //     }
// // }
// public class Practice {

//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == 0) {
//                     for (int col = 0; col < n; col++) {
//                         if (matrix[i][col] != 0)
//                             matrix[i][col] = -1;
//                     }
//                     for (int row = 0; row < m; row++) {
//                         if (matrix[row][j] != 0)
//                             matrix[row][j] = -1;
//                     }
//                 }
//             }
//         }

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == -1)
//                     matrix[i][j] = 0;
//             }
//         }
//     }



//     public static void main(String[] args) {
//         int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//         setZeroes(arr);
//     }
// }




public class 