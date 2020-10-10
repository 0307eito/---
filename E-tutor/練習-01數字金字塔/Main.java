package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String n = "*";
        int spaceCount = 1;
        String space="";
        for (int i = 1; i < count; i++) {
            spaceCount=spaceCount+2;
        }
        spaceCount=(spaceCount-1)/2;


        for (int i = 0; i < spaceCount; i++){
            space=space+" ";
        }

        for (int i = 0; i < count; i++) {
            System.out.println(space+n);
            n = n + "**";
            space = space.substring(1);

        }

    }
}

