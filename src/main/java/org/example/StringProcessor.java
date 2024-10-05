package org.example;
import org.jetbrains.annotations.NotNull;

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

    public int calculateDigits(String sentence){

    }

    public int calculateWord(String sentence){

    }

    public double calculateExpression(String expression){

    }
}
