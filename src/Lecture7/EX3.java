package Lecture7;

import java.util.Arrays;

public class EX3 {
    public static void main (String[] args) {
// random
        final int n = 3;
        int A[][] = new int[n][n];

        for (int i = 0       ;i < n       ;i ++       ) {
            for (int j = 0       ;j < n       ;j ++       ) {
                A[i][j] = (int)(Math.random() * 10.0);
            }
        }
        System.out.println("A random 3x3 matrix A");
        for (int i = 0       ;i < n       ;i ++       ) {
            for (int j = 0       ;j < n       ;j ++       ) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
// sort
        System.out.println("After sorting in each row");
        int B[][] = new int[n][];
        for (int i = 0       ;i < n       ;i ++       ) {
            B[i] = A[i].clone();
            Arrays.sort(B[i]);
        }
        for (int i = 0       ;i < n       ;i ++       ) {
            for (int j = 0       ;j < n       ;j ++       ) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
// identity matrix
        int C[][] = new int[n][n];
        System.out.println("An identity matrix");
        for (int i = 0       ;i < n       ;i ++       ) {
            C[i][i] = 1;
            for (int j = 0       ;j < n       ;j ++       ) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
// sum
        System.out.println("After summing the identity matrix with A");
        int D[][] = new int[n][n];
        for (int i = 0       ;i < n       ;i ++       ) {
            for (int j = 0       ;j < n       ;j ++       ) {
                D[i][j] = A[i][j] + C[i][j];
            }
        }
        for (int i = 0       ;i < n       ;i ++       ) {
            for (int j = 0       ;j < n       ;j ++       ) {
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
