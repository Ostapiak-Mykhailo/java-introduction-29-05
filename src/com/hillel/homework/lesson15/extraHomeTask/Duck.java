package com.hillel.homework.lesson15.extraHomeTask;

public class Duck implements Flyable, Runnable, Swimmable {

    @Override
    public void swim() {
        System.out.println("A duck is swimming");
    }

    @Override
    public void run() {
        System.out.println("A duck is running");
    }

    @Override
    public void fly() {
        System.out.println("A duck is flying");
    }
}
