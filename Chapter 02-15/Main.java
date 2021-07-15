package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1 = input.nextLine();
        String num2 = input.nextLine();
        String[] n1 = num1.split(" ");
        String[] n2 = num2.split(" ");
        double x1 = Double.parseDouble(n1[0]);
        double y1 = Double.parseDouble(n1[1]);
        double x2 = Double.parseDouble(n2[0]);
        double y2 = Double.parseDouble(n2[1]);
        Double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        Double ans=Math.pow(a,0.5);
        System.out.println(ans);
    }
}
