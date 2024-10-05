package org.example;
import java.util.Stack;

public class StringProcessor {
    public boolean isStrongPassword(String password){
        boolean strong = password.length() >= 8; // if password length is more than 8 or equal
        int upper = 0, lower = 0, digit = 0, special = 0;
        for (int i=0; i<password.length(); i++){
            char charset = password.charAt(i);
            if(charset >= 'A' && charset <= 'Z'){
                upper++;
            }else if(charset >= 'a' && charset <= 'z'){
                lower++;
            }else if(charset >= '0' && charset <= '9'){
                digit++;
            }else{
                special++;
            }
            //  if all required character types are here, code will return the strength of the password
            if (upper > 0 && lower > 0 && digit > 0 && special > 0){
                return strong;
            }
        }
//        if something will be missing code will be return false
        return false;
    }

    public int calculateWord(String sentence){
//    this part of code checked if sentence null or empty
        if(sentence==null || sentence.trim().isEmpty()){
            return 0;
        }
        String[] words = sentence.trim().split(" ");
        return words.length;
    }

    public int calculateDigits(String sentence){
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        int digitCount = 0; // initilization a counter of digits
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++; //  Increment the digit counter
            }
        }
        return digitCount;
    }

    public double calculateExpression(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        double currentNumber = 0;
        char lastOperator = '+';

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }

            if ((!Character.isDigit(c) && c != ' ' && c != '(') || i == expression.length() - 1) {
                if (lastOperator == '+') {
                    numbers.push(currentNumber);
                } else if (lastOperator == '-') {
                    numbers.push(-currentNumber);
                } else if (lastOperator == '*') {
                    numbers.push(numbers.pop() * currentNumber);
                } else if (lastOperator == '/') {
                    numbers.push(numbers.pop() / currentNumber);
                }

                lastOperator = c;
                currentNumber = 0;
            }
        }

        double result = 0;
        while (!numbers.isEmpty()) {
            result += numbers.pop();
        }

        return result;
    }
}

//Uses two stacks for numbers and operators.
//iterator over the expression to build the numbers and handle operators.
//applies the last operator to the number and pushes result into the stack.
//at the end, it sums up all numbers in the stack to return the result.
// oh, in the last method i used google habr