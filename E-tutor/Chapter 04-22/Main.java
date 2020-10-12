package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] Str = str.split(" ");
        String n = "x";
        for (int i=0 ; i <= Str[0].length()-Str[1].length() ; i++) {
            if (Str[0].substring(i+0,i+Str[1].length()).equals(Str[1])) {
                System.out.println(Str[1] + " is a substring of " + Str[0]);
                n = "o";
                break;
            }
        }
        if (n.equals("x")){
            System.out.println(Str[1] + " is not a substring of " + Str[0]);
        }
    }
}
