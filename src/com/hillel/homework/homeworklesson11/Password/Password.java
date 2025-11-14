package com.hillel.homework.homeworklesson11.Password;
import java.util.Random;

public class Password {
    String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    String digits = "0123456789";
    String underscore = "_";

    public char getRandomSymbol(String source){
        Random randomChar = new Random();
        int index = randomChar.nextInt(source.length());
        return source.charAt(index);
    }

    public String generate(){
        String password = "";
        String allSymbols = upperCaseLetters + lowerCaseLetters + digits + underscore;
        password += getRandomSymbol(upperCaseLetters);
        password += getRandomSymbol(lowerCaseLetters);
        password += getRandomSymbol(digits);
        password += getRandomSymbol(underscore);

        while (password.length() < 8){
            password += getRandomSymbol(allSymbols);
        }
        return password;
    }
}
