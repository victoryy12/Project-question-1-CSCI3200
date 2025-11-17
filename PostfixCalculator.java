// package CSCI3200;

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
        String[] tokens = postfixExpression.split(" ");
        
        for (String token : tokens) {
            if (isInteger(token)) {
                int num = Integer.parseInt(token);
                stack.push(num);
            } 
            else {
                char operator = token.charAt(0);
                
                int num2 = stack.pop();
                int num1 = stack.pop(); 
                
                int result = 0;
                
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
                
                stack.push(result);
            }
        }
    }
    
    public String toString() {
        return postfixExpression;
    }
    
    public boolean isInteger(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public String getPostfixExpression() {
        return postfixExpression;
    }
    
    public void setPostfixExpression(String postfixExpression) {
        this.postfixExpression = postfixExpression;
    }
}