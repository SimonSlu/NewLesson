package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String familyName = sc.next();
        String name = sc.next();
        String surName = sc.next();

        System.out.println(familyName + " " + name + " " + surName);
        System.out.printf("%s %s %s", familyName, name, surName);
    }
}
