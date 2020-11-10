package com.company;
import java.util.Stack;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String infix = input.nextLine();
        String a = InfixToPostfix(infix) + "";
        String b = a.replaceAll("         "," ").replaceAll("        "," ").replaceAll("       "," ").replaceAll("      "," ").replaceAll("     "," ").replaceAll("    "," ").replaceAll("   "," ").replaceAll("  "," ");
        StringBuffer sb = new StringBuffer(b);
        if (sb.substring(0,1).equals(" ")) {
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
    }
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
    public static StringBuilder InfixToPostfix(String expression) {
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
        return output;
    }
}
