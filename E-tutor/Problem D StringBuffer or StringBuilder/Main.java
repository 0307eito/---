package com.company;
import java.lang.StringBuilder;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String count = input.nextLine();
            for (int i = 0; i < Integer.parseInt(count); i++) {
                String str1 = input.nextLine();
                String str2 = input.nextLine();
                String str3 = input.nextLine();
                String str4 = ReplaceByStringBuilder(str1, str2, str3);
                String ans = ReverseByStringBuilder(str4);
                System.out.println(ans);
            }
        }
    }
    public static String ReverseByStringBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static String ReplaceByStringBuilder(String s, String x, String y) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.lastIndexOf(x)==-1) {
            return s;
        } else {
            String str = s.replaceAll(x, y);
            return str;
        }
    }
}
