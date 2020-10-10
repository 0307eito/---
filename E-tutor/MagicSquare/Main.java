package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("It is not an odd number.");
                if (input.hasNext()) {
                    System.out.println();
                }
            }else if (num % 2 == 1) {
                int[][] magicSquare = new int[num][num];
                int row = num - 1;
                int col = (num - 1) / 2;
                magicSquare[row][col] = 1;
                for (int i = 2; i <= num * num; i++) {
                    row = row + 1;
                    col = col + 1;
                    if (row > num - 1) {
                        row = 0;
                    }
                    if (col > num - 1) {
                        col = 0;
                    }
                    magicSquare[row][col] = i;
                    if (i % num == 0) {
                        row = row - 2;
                        col = col - 1;
                    }
                }
                int centerNum = (num * num + 1) / 2;
                int addNum = centerNum * num;
                System.out.println(addNum);

                for (int i = 0; i < num; i++) {
                    for (int j = 0; j < num; j++) {
                        System.out.printf("%5d", magicSquare[i][j]);
                    }
                    System.out.println();
                }
                if (input.hasNext()) {
                    System.out.println();
                }
            }
        }
    }
}

