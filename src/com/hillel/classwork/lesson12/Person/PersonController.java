package com.hillel.classwork.lesson12.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonController {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String name = PersonController.READER.readLine();

        Person person = new Person(name, 29);

        System.out.println(person);
        System.out.println(person);

        Person person1 = new Person(23);
        System.out.println(person1);
        System.out.println(person1.getName());

        System.out.println("Person count: " + Person.COUNT);

        person1.setAge(45);
        System.out.println(person1.getAge());
    }
}
