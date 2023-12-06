package lesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Vvedi chislo");
            num = sc.nextInt();
            if (num == 1){
                System.out.println("Ugadal");
            } else {
                System.out.println("Ne ugadal");
            }
        } while (num != 1);
    }
}
