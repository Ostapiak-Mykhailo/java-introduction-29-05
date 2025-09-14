package com.hillel.homework.homeworklesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask3While {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int carNumber = Integer.parseInt(bufferedReader.readLine());
        int i = 1;
        while (i <= carNumber){
            soapCar(i);
            washCar(i);
            dryCar(i);
            i++;
        }
    }
    public static void soapCar(int i){
        System.out.println("Намилити машину " + i);
    }
    public static void washCar(int i ){
        System.out.println("Помити машину " + i);
    }
    public static void dryCar(int i ){
        System.out.println("Висушити машину " + i);
    }
}
