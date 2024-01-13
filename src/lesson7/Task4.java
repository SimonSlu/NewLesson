package lesson7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(koren(sc.nextInt()));
    }

    static double koren (int x){
        if (x == 0){
            return 1;
        }
        if (x == 1){
            return 1;
        } else {
            return Math.sqrt((x-1) + Math.sqrt(x));
        }

    }
}
