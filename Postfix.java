// package CSCI3200;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Enter a postfix expression(or enter 0 to end):");
            input = scnr.nextLine();
            
            if (input.equals("0")) {
                System.out.println("Goodbye!");
                break;
            }
            
            Stack<Integer> stack = new Stack<Integer>();
            
            PostfixCalculator calc = new PostfixCalculator(input);
            
            calc.evaluatePostfix(stack);
            
            int result = stack.pop();
            System.out.println("The result of " + calc.toString() + " = " + result);
            System.out.println();
        }
        
        scnr.close();
    }
}