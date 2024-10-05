package org.example;

public class StringProcessor {
    public boolean isStrongPassword(String password){
        boolean bigLetters = false;
        boolean smallLetters = false;
        boolean digits = false;
        boolean specials = false;
        if (password == null || password.isEmpty()){
            return false;
        }
        for (char c : password.toCharArray()){
            if(Character.isUpperCase(c)) bigLetters = true;
        }
    }

    public int calculateDigits(String sentence){

    }

    public int calculateWord(String sentence){

    }

    public
}
