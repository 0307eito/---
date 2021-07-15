package com.company;
public class Main {

    public static void main(String[] args) {

        int num = 0;

        for (int i=2 ; i<10000 ; i++) {
            for (int j=1 ; j<i ; j++) {
                if (i%j==0) {
                    num = num + j;
                }
            }
            if (num==i) {
                System.out.println(i);
            }
            num = 0;
        }
    }
}
