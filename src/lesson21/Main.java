package lesson21;

import lesson19.Car;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String mod;
        String num;

        lesson19.Car[] cars = new lesson19.Car[]{new lesson19.Car("A326CC", "Audi"), new lesson19.Car("H678MM", "BMW"),
                new lesson19.Car("A111AA", "Lada")};

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер");
        num = sc.nextLine();
        System.out.println("Введите модель");
        mod = sc.nextLine();

        findCar(cars, new lesson19.Car(num, mod));
    }

    public static void findCar(lesson19.Car[] cars, lesson19.Car car) {
        boolean find = false;

        for (Car mc : cars) {
            if (mc.equals(car)) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("Автомобиль есть в базе");

        } else {
            System.out.println("автомобиля в базе нету");
        }

    }
}

