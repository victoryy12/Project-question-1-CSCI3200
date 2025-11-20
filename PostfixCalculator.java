//package CSCI3200;

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
        int i = 0;
        while (i < tokens.length) {
            if (isInteger(tokens[i])) {
                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            } 
            else {
                char operator = tokens[i].charAt(0);
                
                int num2 = stack.pop();
                int num1 = stack.pop(); 
                
                int result = 0;
                
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
                stack.push(result);
            }
            i += 1;
        }
    }
    
    public String toString() {
        return postfixExpression;
    }
    
    public boolean isInteger(String token) {
        for (int i = 0; i < token.length(); i++) {
            if (!Character.isDigit(token.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}