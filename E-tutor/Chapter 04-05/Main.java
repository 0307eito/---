package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        double n = Double.parseDouble(str1);
        double s = Double.parseDouble(str2);
        double Area=(n*(s*s))/(4*Math.tan(Math.PI/n));
        System.out.println(Area);
    }
}
