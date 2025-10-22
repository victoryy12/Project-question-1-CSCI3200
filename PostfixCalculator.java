// package CSCI3200;

import java.util.Stack;

/**
 * PostfixCalculator class
 * Evaluates postfix expressions using a stack
 */
public class PostfixCalculator {
    // Data field
    private String postfixExpression;
    
    // Default constructor
    public PostfixCalculator() {
        this.postfixExpression = "";
    }
    
    // Constructor with parameter
    public PostfixCalculator(String string) {
        this.postfixExpression = string;
    }
    
    // Method to evaluate postfix expression
    public void evaluatePostfix(Stack<Integer> stack) {
        // Split the expression into tokens
        String[] tokens = postfixExpression.split(" ");
        
        // While there is more of the expression to read
        for (String token : tokens) {
            // if (the next input is an integer)
            if (isInteger(token)) {
                // Read the next integer and push it onto the stack
                int num = Integer.parseInt(token);
                stack.push(num);
            } else {
                // Read the next character, which is an operator
                char operator = token.charAt(0);
                
                // Pop two numbers off the stack
                int num2 = stack.pop(); // second number (right operand)
                int num1 = stack.pop(); // first number (left operand)
                
                int result = 0;
                
                // Combine the two numbers with the operator
                // using the second number popped as the left operand
                if (operator == '+') {
                    result = num1 + num2;
                } else if (operator == '-') {
                    result = num1 - num2;
                } else if (operator == '*') {
                    result = num1 * num2;
                } else if (operator == '/') {
                    result = num1 / num2;
                } else if (operator == '%') {
                    result = num1 % num2;
                }
                
                // Push the result onto the stack
                stack.push(result);
            }
        }
        // At this point, the stack contains one number, which is the result
    }
    
    // toString method
    public String toString() {
        return postfixExpression;
    }
    
    // Method to determine if token is an integer
    public boolean isInteger(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    // Getter method
    public String getPostfixExpression() {
        return postfixExpression;
    }
    
    // Setter method
    public void setPostfixExpression(String postfixExpression) {
        this.postfixExpression = postfixExpression;
    }
}