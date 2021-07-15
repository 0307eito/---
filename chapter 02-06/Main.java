package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num = input.nextInt();
	    int ans = 1;
	    if (0<=num && num<=1000) {
	        String strNum = String.valueOf(num);
	        for (int i=0 ; i<strNum.length() ; i++) {
	            int n = Integer.parseInt(strNum.substring(i,i+1));
	            ans = ans * n;
            }
        }
	    System.out.println(ans);
    }
}
