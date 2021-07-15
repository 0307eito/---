package com.company;
import java.util.Scanner;
import java.util.Calendar;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Str = input.nextLine();
        String[] str = Str.split(" ");
        String month = str[0];
        String year = str[1];
        String[] allMonth = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};

        Calendar calendar = Calendar.getInstance();
        int Month = Integer.parseInt(month);
        int Year = Integer.parseInt(year);
        calendar.set(Calendar.YEAR, Year);
        calendar.set(Calendar.MONTH, Month-1);

        int result = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(allMonth[Month-1]+" "+year+" had "+String.valueOf(result)+" Days");


    }
}
