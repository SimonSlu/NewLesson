package lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        final String VERT = "|";
        final String GORIZ = "-";
        final String VOID = " ";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи длину");
        int length = sc.nextInt();
        System.out.println("Введи ширину");
        int width = sc.nextInt();

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                System.out.print(VOID);
            } else if (i == length - 1) {
                System.out.println(VOID);
            } else {
                System.out.print(GORIZ);
            }
        }

        for (int j = 0; j < width - 1; j++) {
            for (int i = 0; i < length; i++) {
                if (i == 0) {
                    System.out.print(VERT);
                } else if (i == length - 1) {
                    System.out.println(VERT);
                } else {
                    System.out.print(VOID);
                }
            }
        }

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                System.out.print(VOID);
            } else if (i == length - 1) {
                System.out.println(VOID);
            } else {
                System.out.print(GORIZ);
            }
        }
    }
}
