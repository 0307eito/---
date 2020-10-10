package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1 = input.nextLine();
        String num2 = input.nextLine();
        String[] n1 = num1.split(" ");
        String[] n2 = num2.split(" ");

        double a = Double.parseDouble(n1[0]);
        double b = Double.parseDouble(n1[1]);
        double e = Double.parseDouble(n1[2]);
        double c = Double.parseDouble(n2[0]);
        double d = Double.parseDouble(n2[1]);
        double f = Double.parseDouble(n2[2]);

        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);
        System.out.println(x+" "+y);
    }
}
