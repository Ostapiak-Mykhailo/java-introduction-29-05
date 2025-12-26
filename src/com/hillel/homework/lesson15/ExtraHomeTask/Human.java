package com.hillel.homework.lesson15.ExtraHomeTask;

public class Human extends Object implements Runnable, Swimmable {

    @Override
    public void run() {
        System.out.println("A person is running");
    }

    @Override
    public void swim() {
        System.out.println("A person is swimming");
    }
}
