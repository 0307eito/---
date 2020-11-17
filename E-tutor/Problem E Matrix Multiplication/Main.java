package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        for (int k=0; k<count; k++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int A[][] = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++)
                    A[i][j] = input.nextInt();
            }
            int c = input.nextInt();
            int d = input.nextInt();
            int B[][] = new int[c][d];
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++)
                    B[i][j] = input.nextInt();
            }
            int[][] ans = multiply(A, B, a, b, d);
            display(ans, a, d);
            if (k != count-1) {
                System.out.println("");
            }
        }
    }
    public static int[][] multiply(int[][] first, int[][] second, int a, int b, int d) {
        int[][] product = new int[a][d];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < b; k++) {
                    product[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return product;
    }
    public static void display(int[][] product, int a, int d) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < d; j++) {
                if (j != 0) {
                    System.out.print(" ");
                }
                System.out.print(product[i][j]);
            }
            System.out.println();
        }
    }
}
