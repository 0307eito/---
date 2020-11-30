package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Input = input.nextLine();
        String PostfixeExpression = Computing.InfixToPostfix(Input);
        System.out.println(Computing.postfixEvaluate(PostfixeExpression));
    }
}
class Computing {
    public static boolean operatorOrNot(char ch) {
        if (ch == '^' || ch == '/' || ch == '%' || ch == '*' || ch == '+' || ch == '-' || ch == '(') {
            return true;
        }
        return false;
    }
    public static int Priority(char op) {
        if (op == '/' || op == '*' || op == '%') {
            return 2;
        } else if (op == '+' || op == '-') {
            return 1;
        }
        return Integer.MAX_VALUE;
    }
    public static String InfixToPostfix(String expression) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);
            if (Character.isLetterOrDigit(character) || String.valueOf(character).equals(".")) {
                output.append(character);
            }
            else if (operatorOrNot(character)) {
                while (!stack.isEmpty() && stack.peek() != '(' && Priority(stack.peek()) >= Priority(character)) {
                    output.append(" " + stack.pop() + " ");
                }
                stack.push(character);
            }
            else if (character == ')') {
                while (stack.peek() != '(') {
                    output.append(" " + stack.pop() + " ");
                }
                stack.pop();
            }
            if (!(Character.isLetterOrDigit(character) || String.valueOf(character).equals("."))) {
                output.append(" ");
            }
        }
        while (!stack.isEmpty()) {
            output.append(" " + stack.pop() + " ");
        }
        String Output = output + "";
        String Output1 = Output.replaceAll("         "," ").replaceAll("        "," ").replaceAll("       "," ").replaceAll("      "," ").replaceAll("     "," ").replaceAll("    "," ").replaceAll("   "," ").replaceAll("  "," ");
        StringBuffer sb = new StringBuffer(Output1);
        if (sb.substring(0,1).equals(" ")) {
            sb.deleteCharAt(0);
        }
        sb.setLength(sb.length()-1);
        return sb+"";
    }
    public static String postfixEvaluate(String exp) {
        Stack<Double> s = new Stack<Double> ();
        Scanner tokens = new Scanner(exp);
        while (tokens.hasNext()) {
            if (tokens.hasNextDouble()) {
                s.push(tokens.nextDouble());
            } else {
                double num2 = s.pop();
                double num1 = s.pop();
                String op = tokens.next();
                if (op.equals("+")) {
                    s.push(num1 + num2);
                } else if (op.equals("-")) {
                    s.push(num1 - num2);
                } else if (op.equals("*")) {
                    s.push(num1 * num2);
                } else if (op.equals("/")) {
                    s.push(num1 / num2);
                } else {
                    s.push(num1 % num2);
                }
            }
        }
        DecimalFormat format1 = new DecimalFormat( "#.00");
        return format1.format(s.pop());
    }
}