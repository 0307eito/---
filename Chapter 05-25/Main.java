package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        double n = 0;
        for (int i=1 ; i<=num*2-1 ; i=i+2) {
            if (i%4==1) {
                n = n + 4.0 / i;
            } else {
                n = n - 4.0 / i;
            }
        }
        System.out.println(n);
    }
}
