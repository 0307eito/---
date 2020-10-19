package com.company;
import java.util.Scanner;
import java.util.Calendar;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Year = input.nextInt();
        int firstDay = input.nextInt();
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, Year);

        String[] allMonth = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};
        String week = " Sun Mon Tue Wed Thu Fri Sat";

        if (firstDay==7) {
            firstDay=0;
        }
        String str1 = "";
        for (int ii=1 ; ii<=7-firstDay ; ii++) {
            str1=str1+"   "+ii;
        }
        for (int ii=1 ; ii<=firstDay ; ii++) {
            str1 = "    " + str1;
        }

        int start = 8 - firstDay;
        if (firstDay==0) {
            start=8;
        }

        int n = 0;
        int nn = 0;
        int start2 = 0;

        for (int i=0 ; i<12 ; i++) {

            System.out.println("          "+allMonth[i] + " " + Year);
            System.out.println("-----------------------------");
            System.out.println(week);


            calendar.set(Calendar.MONTH, i);
            int dayCount = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);


            if (i==0) {
                firstLine(firstDay);
                for (int j = start; j <= dayCount; j++) {
                    n = n + 1;
                    if (n % 7 == 0) {
                        System.out.printf("  %2d", j);

                        System.out.println();
                    } else {
                        System.out.printf("  %2d", j);
                    }
                }
                if (n%7==0) {
                    System.out.println();
                }else {
                    System.out.println();
                    System.out.println();
                }
                nn = n%7;
                n=0;
            }
            if (i!=0) {
                start2 = 8 - nn;
                if (nn==0) {
                    start2=8;
                }

                firstLine(nn);

                for (int j = start2; j <= dayCount; j++) {
                    n = n + 1;
                    if (n % 7 == 0) {
                        System.out.printf("  %2d", j);
                        System.out.println();
                    } else {
                        System.out.printf("  %2d", j);
                    }
                }
                if (n % 7 != 0 && i!=11) {
                    System.out.println();
                    System.out.println();
                }
                if (n % 7 == 0 && i!=11) {
                    System.out.println();
                }
                if (n % 7 != 0 && i==11) {
                    System.out.println();
                }
                nn=n%7;
                n=0;
            }
        }
    }
    public static void firstLine(int num) {
        if (num==7) {
            num=0;
        }
        String str1 = "";
        for (int ii=1 ; ii<=7-num ; ii++) {
            str1=str1+"   "+ii;
        }
        for (int ii=1 ; ii<=num ; ii++) {
            str1 = "    " + str1;
        }
        System.out.println(str1);
    }
}
