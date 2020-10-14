package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n=1;
        for (int i=2 ; true ; i++) {
            if (num==1){
                System.out.printf("1 %d\n",1);
                break;
            }
            if (num%i==0 && num!=i) {
                System.out.printf("%d ", i);
                num = num / i;
                i = 1;
                n = 0;
            }else if (num==i && n==1) {
                System.out.printf("1 %d\n", i);
                break;
            }else if (num==i){
                System.out.printf("%d\n", i);
                break;
            }
        }
    }
}
