package com.hillel.classwork.lesson4;

public class Classtask {

    public static void main(String[] args) {
// a,b,c - зарплати працівників. A,B,C - зарплати за 10 років
        int a = 25000;
        int b = 35000;
        int c = 180_000;
        int A = 12 * 10 * a;
        int B = 12 * 10 * b;
        int C = 12 * 10 * c;
        System.out.println(A + " - salary for 10 years");
        System.out.println(B + " - salary for 10 years");
        System.out.println(C + " - salary for 10 years");
        int taxA = A / 100 * 5;
        int taxB = B / 100 * 5;
        int taxC = C / 100 * 5;
        System.out.println(taxA + " - tax for 10 years");
        System.out.println(taxB + " - tax for 10 years");
        System.out.println(taxC + " - tax for 10 years");
        int averageA = ((A - taxA) / (12 * 10));
        int averageB = ((B - taxB) / (12 * 10));
        int averageC = ((C - taxC) / (12 * 10));
        System.out.println(averageA + " average salary for 10 years");
        System.out.println(averageB + " average salary for 10 years");
        System.out.println(averageC + " average salary for 10 years");
        int averange = ((A - taxA) + (B - taxB) + (C - taxC) /3);
        System.out.println(averange + " average in company for 10 years");




    }
}
