// package CSCI3200;

import java.util.Scanner;
import java.util.Stack;

/**
 * Postfix Calculator Program
 * Project #1: Postfix Calculator using Stacks
 * This program evaluates postfix expressions entered by the user
 */
public class Postfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        // Loop until user enters 0
        while (true) {
            // Prompt user for input
            System.out.print("Enter a postfix expression(or enter 0 to end):");
            input = scanner.nextLine();
            
            // Check if user wants to exit
            if (input.equals("0")) {
                System.out.println("Goodbye!");
                break;
            }
            
            // Create a stack of type Integer
            Stack<Integer> stack = new Stack<Integer>();
            
            // Create PostfixCalculator object with user input
            PostfixCalculator calculator = new PostfixCalculator(input);
            
            // Evaluate the postfix expression
            calculator.evaluatePostfix(stack);
            
            // Display the result
            int result = stack.pop();
            System.out.println("The result of " + calculator.toString() + " = " + result);
            System.out.println();
        }
        
        scanner.close();
    }
}