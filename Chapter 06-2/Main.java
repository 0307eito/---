package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        System.out.println(sumDigits(num));
    }
    public static int sumDigits(long n){
        int sum = 1;
        int input = (int)n;
        if (input == 0) {
            return 0;
        }else{
            while (input != 0) {
                sum = sum * (input % 10);
                input = input / 10;
            }
            return sum;
        }
    }
}