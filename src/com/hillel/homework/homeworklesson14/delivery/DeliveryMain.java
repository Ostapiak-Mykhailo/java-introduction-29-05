package com.hillel.homework.homeworklesson14.delivery;

/*Задача 1. Розрахунок вартості доставки вантажів
Компанія займається доставкою вантажів. Є три типи відправлень:
        1️⃣ Звичайна доставка
Вартість = вага * базовий тариф.
Базовий тариф = 12 грн/кг.
2️⃣ Експрес-доставка
        Вартість = вага * тариф * коефіцієнт швидкості (1.8)
Але якщо вага більше 50 кг — нараховується доплата + 200 грн.
3️⃣ Міжнародна доставка
Вартість = вага * тариф * валютний коефіцієнт (1.5)
А якщо країна — "USA", додається мито + 300 грн.
✔️ Завдання:
Створити базовий клас Delivery.
Створити 3 дочірні класи.
У кожному перевизначити метод calculatePrice().
У main() створити по одному об’єкту кожного типу доставки і вивести вартість доставки.*/

public class DeliveryMain {

    public static void main(String[] args) {

        Delivery parcel1 = new StandardDelivery(10);
        Delivery parcel2 = new ExpressDelivery(12);
        Delivery parcel3 = new InternationalDelivery(35, "Poland");
        Delivery parcel4 = new InternationalDelivery(35, "USA");

        parcel1.printMessage();
        parcel2.printMessage();
        parcel3.printMessage();
        parcel4.printMessage();
    }
}
