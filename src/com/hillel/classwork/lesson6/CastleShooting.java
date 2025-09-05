package com.hillel.classwork.lesson6;

public class CastleShooting {
// задача із презентації урок 5. Стрільба по замку
    public static void main(String[] args) {
        determinehit(1580);
    }
public static void determinehit(int firerange){
if (firerange < 1000) {
    System.out.println("You missed the castle");
} else if (firerange >= 1000 && firerange<= 1500){
    System.out.println("You hit the castle");
} else {
        System.out.println("You missed the castle");
    }
}
}
