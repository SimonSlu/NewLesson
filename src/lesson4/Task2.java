package lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int preNum;

        if (num < 10){
            sum = num;
        } else {

            while (num > 0) {
                preNum = num % 10;
                sum += preNum;
                num /= 10;
            }
        }
        System.out.println(sum);
    }
}
