package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int u = 0;
        String ans = "";
        for (int i = 2 ; i<=num ; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    u=1;
                }
            }
            if (u==0) {
                ans = ans + String.valueOf(i) + " ";
            }
            u=0;
        }
        StringBuilder Ans = new StringBuilder(ans);
        Ans.setLength(Ans.length() - 1);
        System.out.println(Ans);
    }
}

