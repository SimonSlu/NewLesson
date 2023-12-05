package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную а");
        double a = scanner.nextInt();
        System.out.println("Введите переменную b");
        double b = scanner.nextInt();

        if (a*a*a > b*b){
            System.out.println("а в кубе больше b в квадрате");
        } else {
            System.out.println("а в кубе меньше b в квадрате");
        }
    }
}
