package com.company;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1 = input.nextLine();
        String num2 = input.nextLine();
        String num3 = input.nextLine();
        String[] n1 = num1.split(" ");
        String[] n2 = num2.split(" ");
        String[] n3 = num3.split(" ");
        double x1 = Double.parseDouble(n1[0]);
        double y1 = Double.parseDouble(n1[1]);
        double x2 = Double.parseDouble(n2[0]);
        double y2 = Double.parseDouble(n2[1]);
        double x3 = Double.parseDouble(n3[0]);
        double y3 = Double.parseDouble(n3[1]);

        double w_1 = (x1 - x3)*(x1 - x3) + (y1 - y3)*(y1 - y3);
        double w1 = Math.pow(w_1,0.5);
        double w_2 = (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);
        double w2 = Math.pow(w_2,0.5);
        double w_3 = (x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2);
        double w3 = Math.pow(w_3,0.5);

        double s = (w1 + w2 + w3) / 2;
        double a = s*(s-w1)*(s-w2)*(s-w3);
        double ans = Math.pow(a,0.5);

        BigDecimal answer= new BigDecimal(ans);
        BigDecimal Answer = answer.setScale(3, RoundingMode.DOWN);
        if (Answer.doubleValue()==0) {
            System.out.println("Not Triangle");
        }else{
            System.out.println(Answer);
        }
    }
}

