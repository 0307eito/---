package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String str = input.nextLine();
            String[] num = str.split("[\\+\\-\\*\\/\\(\\)\\%]+");
            String str1 = str;
            for (int i=0 ; i<num.length ; i++) {
                str1 = str1.replaceFirst(num[i],"");
            }
            String[] sign = str1.split("");
            for (int i=0 ; i<num.length ; i++) {
                if (i == num.length-1) {
                    System.out.println(num[i]);
                } else if (num[i].length() != 0) {
                    System.out.printf("%s ",num[i]);
                }
            }
            for (int i=0 ; i<sign.length ; i++) {
                if (i == sign.length-1) {
                    System.out.println(sign[i]);
                } else {
                    System.out.printf("%s ",sign[i]);
                }
            }
            double total = 0;
            for (int i=0 ; i<num.length ; i++) {
                if (num[i].length() != 0) {
                    total = total + Double.parseDouble(num[i]);
                }
            }
            DecimalFormat format01 = new DecimalFormat( "#.000");
            System.out.println(format01.format(total));
        }
    }
}
