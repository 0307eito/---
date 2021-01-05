package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String side = input.nextLine();
        String[] Side = side.split(" ");
        double side1 = Double.parseDouble(Side[0]);
        double side2 = Double.parseDouble(Side[1]);
        double side3 = Double.parseDouble(Side[2]);
        String t1 = input.nextLine();
        String t2 = input.nextLine();

        GeometricObject T2 = new GeometricObject();
        Triangle T1 = new Triangle();

        System.out.println(T1.getSide(side1, side2, side3));
        System.out.println(T1.getArea(side1, side2, side3));
        System.out.println(T1.getPerimeter(side1, side2, side3));
        System.out.println(T2.toString1(t1));
        System.out.println(T2.toString2(t2));
    }
}
class Triangle extends GeometricObject {

    public String getSide(double side1, double side2, double side3) {
        return "Triangle: side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
    }

    public String getArea(double side1, double side2, double side3) {
        double S = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
        return "The area is "+area;
    }
    public String getPerimeter(double side1, double side2, double side3) {
        String perimeter = String.valueOf(side1 + side2 + side3);
        return "The perimeter is "+perimeter;
    }
}
class GeometricObject {

    public String toString1(String color) {
        return color;
    }

    public String toString2(String Boolean) {
        return Boolean;
    }
}