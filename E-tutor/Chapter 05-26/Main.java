package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        double e = 1;
        double ii = 1;
        for (int i=1 ; i<=num ; i++) {
            ii = ii * i;
            e = e + 1 / ii;
        }
        System.out.println(e);
    }
}
