package CSCI3200;

import java.util.Stack;

public class PostfixCalculator {
    private String postfixExpression;
    
    public PostfixCalculator() {
        this.postfixExpression = "";
    }
    
    public PostfixCalculator(String string) {
        this.postfixExpression = string;
    }
    
    public void evaluatePostfix(Stack<Integer> stack) {
        // Split the expression into "tokens" ie numbers and symbols
        String[] tokens = postfixExpression.split(" ");
        int i = 0;
        
        // iterate thru it
        while (i < tokens.length) {
            // if it's a number push it onto a stack
            if (isInteger(tokens[i])) {
                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            } 
            // If it's not a number do whatever it is
            else {
                char operator = tokens[i].charAt(0);
                
                // Get last 2 numbers from stack
                int num2 = stack.pop();
                int num1 = stack.pop(); 
                
                int result = 0;
                
                // Match symbol to operation
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                // Push back onto stack for next calculation
                stack.push(result);
            }
            i += 1;  // Move to the next token
        }
    }
    
    // Returns the expression as a string
    public String toString() {
        return postfixExpression;
    }
    
    // Helper method to check if a string is a valid integer
    public boolean isInteger(String token) {
    	// check not invalid
    	if (token == null || token.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(token); // built in, catches any integer including negatives
            return true;
        } 
        catch (Exception e) { // if not an integer it throws an error
            return false;
        }
    }
}