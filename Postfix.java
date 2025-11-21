package CSCI3200;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        // get input
        Scanner scnr = new Scanner(System.in);
        String input;
        
        // Loop until user exits
        while (true) {
            System.out.print("Enter a postfix expression\n");
            System.out.print("Separate each number or operator by a space, enter 0 to quit: ");

            input = scnr.nextLine();
            
            // if 0 then exit the loop
            if (input.equals("0")) {
                System.out.println("Goodbye!");
                break;
            }
            
            // Stack to hold the numbers
            Stack<Integer> stack = new Stack<Integer>();
            
            // Do the calculation
            PostfixCalculator calc = new PostfixCalculator(input);
            calc.evaluatePostfix(stack);
            
            // The result will be last thing left on the stack
            int result = stack.pop();
            
            // Output
            System.out.println("The result of " + calc.toString() + " = " + result + "\n");
        }
        
        scnr.close();
    }
}