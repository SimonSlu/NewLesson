package lesson19;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String mod;
        String num;

        Car[] cars = new Car[]{new Car("A326CC", "Audi"), new Car("H678MM", "BMW"),
                new Car("A111AA", "Lada")};

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер");
        num = sc.nextLine();
        System.out.println("Введите модель");
        mod = sc.nextLine();

        findCar(cars, new Car(num, mod));
    }

    public static void findCar(Car[] cars, Car car) {
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

