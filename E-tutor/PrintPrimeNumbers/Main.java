package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int u = 0;
        List<String> list = new ArrayList<String>();
        int num = input.nextInt();
        for (int i=2 ; i<=num ; i++) {
            for (int j=2 ; j<i ; j++) {
                if (i % j == 0) {
                    u = 1;
                }
            }
            if (u==0) {
                list.add(String.valueOf(i));
            }
            u=0;
        }
        for (int k=0 ; k<list.size() ; k++) {
            if (k==list.size()-1) {
                System.out.printf("%s\n",list.get(k));
            } else if ((k+1)%10==0) {
                System.out.printf("%s\n",list.get(k));
            } else {
                System.out.printf("%s ",list.get(k));
            }
        }
    }
}
