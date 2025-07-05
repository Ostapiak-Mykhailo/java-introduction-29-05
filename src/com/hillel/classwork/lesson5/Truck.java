package com.hillel.classwork.lesson5;

public class Truck {
    public static void main(String[] args) {

       int length = 6;
       int width = 4;
       int height = 2;
       int volume = calculateVolume(length, width, height);
        print(volume);

        int maxWeight = 58;

        int totalWeight =calculateTotalWeight(volume, maxWeight);

        System.out.println(maxWeight);

    }

    public static int calculateVolume(int width, int height, int length){
        int volume = width * height * length;
        return volume;
    }

    public static int calculateTotalWeight(int volume, int maxWeight){
        return volume * maxWeight;

    }
    public static void print(int volume){
        System.out.println(volume);
    }

}
