package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        int N = 0;
        while (input.hasNextLine()) {
            String count_ = input.nextLine();
            if (count_.equals("-1")) {
                break;
            }
            int count = Integer.parseInt(count_);
            int[][] Square = new int[count][count];
            for (int i = 0; i < count; i++) {
                String row = input.nextLine().replace(" ", "");
                for (int j = 0; j < count; j++) {
                    Square[i][j] = list.indexOf(row.substring(j, j + 1));
                }
            }
            String space = input.nextLine();
            int n1 = 0;
            int n2 = 0;
            List<String> list1 = new ArrayList<>();
            for (int i=0 ; i<count ; i++) {
                list1.add(Square[0][i]+"");
            }
            for (int i = 0; i < count; i++) {
                Set<String> setlist = new HashSet<>();
                for (int j = 0; j < count; j++) {
                    setlist.add(Square[i][j] + "");
                }
                if (setlist.size() != count) {
                    n1 = 1;
                    break;
                }
                List<String> setList = new ArrayList<>(setlist);
                for (int k = 0; k < count; k++) {
                    for (int l = 0; l < count; l++) {
                        if (setList.get(k).equals(list1.get(l))) {
                            n1 = 0;
                            break;
                        }
                        n1 = 1;
                    }
                    if (n1 == 1) {
                        break;
                    }
                }
            }
            for (int i = 0; i < count; i++) {
                Set<String> setlist = new HashSet<>();
                for (int j = 0; j < count; j++) {
                    setlist.add(Square[j][i] + "");
                }
                if (setlist.size() != count) {
                    n2 = 1;
                    break;
                }
                List<String> setList = new ArrayList<>(setlist);
                for (int k = 0; k < count; k++) {
                    for (int l = 0; l < count; l++) {
                        if (setList.get(k).equals(list1.get(l))) {
                            n2 = 0;
                            break;
                        }
                        n2 = 1;
                    }
                    if (n2 == 1) {
                        break;
                    }
                }
            }
            N = N + 1;
            if (N != 1) {
                System.out.println("");
            }
            if (n1 == 0 && n2 == 0) {
                System.out.println("The input array is a Latin square");
            } else {
                System.out.println("The input array is not a Latin square");
            }
        }
    }
}