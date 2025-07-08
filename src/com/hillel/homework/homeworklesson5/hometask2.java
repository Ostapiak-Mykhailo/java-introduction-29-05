package com.hillel.homework.homeworklesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hometask2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("length is: ");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("width is: ");
        int width = Integer.parseInt(reader.readLine());
        System.out.println("height is: ");
        int height = Integer.parseInt(reader.readLine());

        defineBagParameters(length, width, height);
    }
    public static void defineBagParameters(int length, int width, int height) {
        if (length <= 55 && width <= 20 && height <= 40) {
            System.out.println("Сумка проходить як ручна поклажа");
        } else if (length <= 40 && width <= 22 && height <= 53){
            System.out.println("Сумка проходить як ручна поклажа");
        } else {
            System.out.println("Сумка не проходить як ручна поклажа, будь ласка здайте її в багаж");
        }
    }
}

