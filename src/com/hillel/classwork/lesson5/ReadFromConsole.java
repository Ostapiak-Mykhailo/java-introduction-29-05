package com.hillel.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ReadFromConsole {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        System.out.println("as string " + str);

        Integer d = Integer.parseInt(str);
        System.out.println("as int " + d);
    }
}
