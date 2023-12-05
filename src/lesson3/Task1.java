package lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную а");
        double a = scanner.nextInt();
        System.out.println("Введите переменную b");
        double b = scanner.nextInt();

        if (a % 2 == 0){
            System.out.println("Произведение двух чисел: " + (a*b));
        } else {
            System.out.println("Частное двух чисел: " + (a/b));
        }
        if (a==b){
            System.out.println("Введенные числа равны");
        }
    }
}
