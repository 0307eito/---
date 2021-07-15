package com.company;

public class Main {
    public static void main(String[] args) {
        for (int i = 1 ; i<=9 ; i++) {
            for (int j = 1 ; j<=9 ; j++) {
                int k = i * j;
                if (j==9) {
                    System.out.printf("%d *%2d = %2d",i,j,k);
                }else{
                    System.out.printf("%d *%2d = %2d ",i,j,k);
                }
            }
            System.out.printf("\n");
        }
    }
}
