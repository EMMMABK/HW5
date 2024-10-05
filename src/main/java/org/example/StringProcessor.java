package org.example;
import java.util.Stack;

public class StringProcessor {
    public boolean isStrongPassword(String password){
        boolean strong = password.length() >= 8;
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
            if (upper > 0 && lower > 0 && digit > 0 && special > 0){
                return strong;
            }
        }
        return false;
    }

    public int calculateWord(String sentence){
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
        int digitCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    public double calculateExpression(String expression){

    }
}
