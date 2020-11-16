package com.company;
import java.awt.geom.Point2D;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String count = input.nextLine();
        for (int j = 0; j<Integer.parseInt(count); j++) {
            String str = input.nextLine();
            String[] Str = str.split(" ");
            double x1 = Integer.parseInt(Str[0]);
            double y1 = Integer.parseInt(Str[1]);
            double x2 = Integer.parseInt(Str[2]);
            double y2 = Integer.parseInt(Str[3]);
            double x3 = Integer.parseInt(Str[4]);
            double y3 = Integer.parseInt(Str[5]);
            Point2D P1 = Triangle.makePoint(x1, y1);
            Point2D P2 = Triangle.makePoint(x2, y2);
            Point2D P3 = Triangle.makePoint(x3, y3);
            double aside = Point.distanceBetween(P1, P2);
            double bside = Point.distanceBetween(P2, P3);
            double cside = Point.distanceBetween(P3, P1);
            double area = Triangle.method(aside, bside, cside);
            BigDecimal A = new BigDecimal(aside);
            BigDecimal Aside = A.setScale(3, BigDecimal.ROUND_HALF_UP);
            BigDecimal B = new BigDecimal(bside);
            BigDecimal Bside = B.setScale(3, BigDecimal.ROUND_HALF_UP);
            BigDecimal C = new BigDecimal(cside);
            BigDecimal Cside = C.setScale(3, BigDecimal.ROUND_HALF_UP);
            BigDecimal D = new BigDecimal(area);
            BigDecimal AREA = D.setScale(3, BigDecimal.ROUND_HALF_UP);
            ArrayList<BigDecimal> list = new ArrayList<>(Arrays.asList(Aside, Bside, Cside));
            Collections.sort(list);
            if (Triangle.isTriangle(aside, bside, cside) == "true") {
                for (int i = 0; i < 3; i++) {
                    System.out.printf("%s ", list.get(i));
                }
                System.out.println(AREA);
            } else if (Triangle.isTriangle(aside, bside, cside) == "false") {
                System.out.println("Just Line!");
            }
        }
    }
}
class Triangle {
    public static Point2D makePoint(double x, double y) {
        Point2D point = new Point2D.Double(x, y);
        return point;
    }
    public static String isTriangle(double aside, double bside, double cside) {
        if ((aside + bside) > cside && (aside + cside) > bside && (bside + cside) > aside) {
            return "true";
        } else {
            return "false";
        }
    }
    public static double method(double aside, double bside, double cside) {
        double S = (aside+bside+cside) / 2;
        return Math.sqrt(S*(S-aside)*(S-bside)*(S-cside));
    }
}
class Point {
    public static double distanceBetween(Point2D P1, Point2D P2) {
        return Math.sqrt((P1.getX() - P2.getX())*(P1.getX() - P2.getX()) + (P1.getY() - P2.getY())*(P1.getY() - P2.getY()));
    }
}

