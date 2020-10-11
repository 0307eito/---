package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] Str = str.split(" ");
        double x = Double.parseDouble(Str[0]);
        double y = Double.parseDouble(Str[1]);
        double length = x*x + y*y;
        double Length = Math.pow(length,0.5);
        if (Length<=10) {
            System.out.println("(" + x + "," + y + ")" + " is in the circle");
        }else{
            System.out.println("(" + x + "," + y + ")" + " is not in the circle");
        }
    }
}
