package com.company;

import java.util.Scanner;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String num = input.nextLine();
            String[] Num = num.split(" ");
            BigInteger n1 = new BigInteger(Num[0]);
            BigInteger n2 = new BigInteger(Num[1]);
            BigInteger gcd = n1.gcd(n2);
            BigInteger lcm = n1.multiply(n2).divide(n1.gcd(n2));;
            System.out.println(gcd + " " + lcm);
            
            for (int i=0 ; i<5 ; i++) {
                if (i != 4) {
                    lcm = lcm.nextProbablePrime();
                    System.out.printf("%s ", lcm);
                } else {
                    lcm = lcm.nextProbablePrime();
                    System.out.println(lcm);
                }
            }
        }
    }
}
