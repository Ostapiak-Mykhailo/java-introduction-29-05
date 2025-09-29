package com.hillel.classwork.lesson8;

public class ArrayLink {

    public static void main(String[] args) {

        String[] strings = new String[3];
        fillArray(strings);

            printArray(strings);
            System.out.println("Strings Link " + strings);


            String[] anotherString = strings;
            System.out.println("AnotherStrings Link " + anotherString);

            anotherString[0] = "new text";
            System.out.println(strings[0]);
            System.out.println(anotherString[0]);
            String[] newStrings = createAndFillArray(10);
            printArray(newStrings);
    }
    public static void fillArray(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "str " + i;
        }
    }
    public static void printArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
    public static String[] createAndFillArray(int size){
        String[] strings = new String[size];
        fillArray(strings);
        return strings;
    }
}
