package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String s = "";

        while (true) {


            for (int n = 2; n != 1; n++) {
                if (number % n == 0) {
                    number = number / n;
                    String p = String.valueOf(n);
                    s = s + p + " ";
                    break;
                }

            }

            if (number == 1) {
                break;
            }

        }
        StringBuilder sb = new StringBuilder(s);
        sb.setLength(sb.length() - 1);
        System.out.println(sb);

    }
}
