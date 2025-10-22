//--------------------------------------------------------------
//Group Members: Victor Perez, Callum Maclean
//Date: 2025
//Course: Data Structures and Algorithm Analysis (CSCI 3200)
//Project Description: Project 1 Postfix Calculator using Stacks
//--------------------------------------------------------------

import java.util.Stack;
import java.util.Scanner;

public class PostfixCalculator{

    private String postfixString;

    public PostfixCalculator(String string) {
        postfixString = string;
    }
    
    public void evaluatePostfix(Stack<Integer> stack){
        int i = 0;
        While (i < postfixString.length()){
            char ch  = postfixString.charAt(i);
            if (Character.isDigit(ch)) {
                
            }
            else
            {
            /*
            Read the next character, which is an operator.
            Pop two numbers off the stack.
            Combine the two numbers with the operator using the
            second number popped as the left operand) and push
            the result onto the stack.)
            }
            }
            At this point, the stack contains one number, which is the
            result of the expression.
            */
    }
}
