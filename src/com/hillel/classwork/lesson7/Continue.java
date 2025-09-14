package com.hillel.classwork.lesson7;

public class Continue {

    public static void main(String[] args) {

        for(int i = 1; i <=150; i++){
            if(i % 7 != 0){
                continue;
            }
            System.out.println("I: " + i);
        }
    }
}
