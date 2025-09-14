package com.hillel.homeworklesson7;

public class HomeTask2 {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (determineLuckynumber(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean determineLuckynumber(int number) {
        while (number > 0) {
            int x = number % 10;
            if (x == 4 || x == 9){
               return false;
            }
            number = number / 10;
        }
        return true;
    }
}

