package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 0;
        int p = 0;
        String str = "";
        List<String> list1 = new ArrayList<>();
        for (int i = 2 ; true ; i++) {
            for (int j=2 ; j<i ; j++) {
                if (i%j == 0) {
                    n = 1;
                    break;
                }
            }
            if (n == 0) {
                str = i + "";
                for (int k=0 ; k<str.length()/2 ; k++) {
                    if (str.substring(k , k+1).equals(str.substring(str.length()-k-1 , str.length()-k))) {
                        p = p + 1;
                    }
                }
                if (p == str.length()/2) {
                    list1.add(str);
                }
            }
            p = 0;
            n = 0;
            if (list1.size() == 100) {
                break;
            }
        }
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int count = input.nextInt();
            if (count == 0) {
                System.out.println("");
            } else {
                for (int i=0 ; i<count ; i++) {
                    if (i % 10 == 9) {
                        System.out.println(list1.get(i));
                    } else if (i == count-1) {
                        System.out.println(list1.get(i));
                    } else {
                        System.out.printf("%s ", list1.get(i));
                    }
                }
            }
        }
    }
}