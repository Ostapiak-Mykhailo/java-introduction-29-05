package com.hillel.homework.homeworklesson14.Insurance;

/*Задача 2. Розрахунок вартості страховки автомобіля
Страхова компанія рахує ціну страховки за формулою:
Базова формула:
ціна = (ціна_авто * базовий_коефіцієнт)
де базовий коеф = 0.02
Є три типи страхування:
        1️⃣ Легковий автомобіль (Car)
Бонус за безаварійність — мінус 5% від страховки.
        2️⃣ Вантажівка (Truck)
Якщо вантажопідйомність > 5 тонн — надбавка + 10% до страховки.
        3️⃣ Електромобіль (ElectricCar)
знижка за екологічність — мінус 8%
але якщо батарея менше 60 kWh — додаткова надбавка + 5%
        ✔️ Завдання:
Створити базовий клас Insurance.
У конструкторі передавати ціну авто.
        Створити 3 дочірні класи та перевизначити метод calculateInsurance().
У main() створити по одному авто кожного типу і показати вартість страховки.*/

public class InsuranceMain {

    public static void main(String[] args) {

        Insurance car1 = new Car(20000, false);
        Insurance car2 = new Car(20000, true);
        Insurance truck1 = new Truck(400000, 4.5);
        Insurance truck2 = new Truck(400000, 6.5);
        Insurance electricCar1 = new ElectricCar(300000, 55);
        Insurance electricCar2 = new ElectricCar(300000, 70);

        car1.printMessage();
        car2.printMessage();
        truck1.printMessage();
        truck2.printMessage();
        electricCar1.printMessage();
        electricCar2.printMessage();

    }
}
