package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] Str = str.split(" ");
        int ans = 0;
        int place = Str[0].length()-1;
        for (int i=0 ; i<Str.length ; i++) {
            for (int j = 0; j < Str[i].length(); j++) {
                place = place - j;
                String Place = Str[i].substring(place, place + 1);
                if (Place.equals("1")) {
                    ans = ans + (int) Math.pow(2, j);
                }
                place = Str[0].length()-1;
            }
            System.out.println(ans);
            ans = 0;
            place = Str[0].length()-1;
        }
    }
}