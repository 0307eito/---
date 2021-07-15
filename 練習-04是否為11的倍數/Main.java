package com.company;
import java.util.Scanner;
import java.math.*;
import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String n1 = input.nextLine();
            int oddNum = 0;
            int evenNum = 0;
            if (n1.equals("0")){
                break;
            }
            for (int i = 0; i < n1.length(); i = i + 2) {
                oddNum = oddNum + Integer.parseInt(n1.substring(i, i + 1));
            }
            for (int i = 1; i < n1.length(); i = i + 2) {
                evenNum = evenNum + Integer.parseInt(n1.substring(i, i + 1));
            }
            if ((oddNum - evenNum) % 11 == 0) {
                System.out.println(n1 + " is a multiple of 11.");
            } else {
                System.out.println(n1 + " is not a multiple of 11.");
            }
        }
    }
}