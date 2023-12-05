package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную а");
        double a = scanner.nextDouble();
        System.out.println("Введите переменную b");
        double b = scanner.nextDouble();
        double c = b*a*(a+b)/(a*a);
        System.out.println(c);
    }
}
