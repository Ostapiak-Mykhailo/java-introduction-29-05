package com.hillel.classwork.lesson8;
/*В убийстве Кеннеди есть 10 подозреваемых.
   Для каждого установлена вероятность того, что он является убийцей.
   Вероятности записаны в массив чисел.
   Определить номер подозреваемого с самой большой вероятностью.*/
public class Murder {

    public static void main(String[] args) {

        int[] values = {20, 76, 56, 23, 40, 99, 1, 29, 78};
        int index = 0;
        int max = values[index];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
                index = i;

            }
        }
        System.out.println("Murderer is number " + index + " with value " + max);
    }
}
