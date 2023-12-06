package lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++){

            if (num % 2 == 0){
                System.out.printf("%d + %d = %d \n", i, num, (i + num));
            } else {
                System.out.printf("%d - %d = %d \n", i, num, (i - num));
            }
            if (i == num){
                System.out.println("Числа равны");
            }
        }
    }
}
