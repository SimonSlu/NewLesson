package lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.printf("Введи %d элемент массива \n", (i+1));
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++){
            if (i == 0){
                int num = arr[i] + arr[arr.length-1];
                System.out.println(num);
            } else {
                int num = arr[i] + arr[i-1];
                System.out.println(num);
            }
        }
    }
}
