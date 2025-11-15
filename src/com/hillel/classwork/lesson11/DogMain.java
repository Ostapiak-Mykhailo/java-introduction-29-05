package com.hillel.classwork.lesson11;

public class DogMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.run();

        System.out.println(dog.age);
        System.out.println(dog.breed);
        System.out.println(dog.color);
        System.out.println(dog.size);

        dog.breed = "Mastiff";
        dog.age = 5;
        dog.size = "Medium";
        dog.color = "Black";


        System.out.println(dog.age);
        System.out.println(dog.breed);
        System.out.println(dog.color);
        System.out.println(dog.size);

        Dog dog2 = new Dog();
        dog2.breed = "Maltese";
        dog2.color = "White";
        dog2.age = 5;
        dog2.size = "Medium";

        System.out.println(dog2.age);
        System.out.println(dog2.breed);
        System.out.println(dog2.color);
        System.out.println(dog2.size);

        dog2.run();
        Dog dog3 = dog;

        System.out.println(dog);
        System.out.println(dog2);
        System.out.println(dog3);

        dog3.color = "brown";
        System.out.println(dog3.color);

        System.out.println(dog == dog2);
        System.out.println(dog.equals(dog2));
        System.out.println(dog == dog3);
        System.out.println(dog.equals(dog3));

        Dog dog4 = new Dog("Chow chow", "Medium", 2, "brown");

        System.out.println(dog4);
    }
}
