package com.hillel.homework.homeworklesson11.Password;

public class PasswordMain {

    public static void main(String[] args) {
        Password generator = new Password();
        String password = generator.generate();
        System.out.println("Your password is: " + password);
    }
}
