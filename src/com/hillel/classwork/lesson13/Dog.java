package com.hillel.classwork.lesson13;

public class Dog extends Animal {

    public Dog(){
        super("black"); /* Параметри у наслідника можуть бути свої, але до батьківському конструктору треба
                                 передати його параметри */
    }

    @Override
    public void speak() {
        System.out.println("gauvf");
        action();
    }

    private void action(){
        System.out.println("wagging tail");
    }
}
