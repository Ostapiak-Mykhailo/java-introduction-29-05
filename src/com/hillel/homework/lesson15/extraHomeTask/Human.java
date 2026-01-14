package com.hillel.homework.lesson15.extraHomeTask;

public class Human implements Runnable, Swimmable {

    @Override
    public void run() {
        System.out.println("A person is running");
    }

    @Override
    public void swim() {
        System.out.println("A person is swimming");
    }
}
