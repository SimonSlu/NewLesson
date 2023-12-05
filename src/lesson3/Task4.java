package lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a%2==0 || b%3==0){
            if (a == b){
                System.out.println("a = b");
            } else {
                System.out.println(a > b ? "а больше b" : "a меньше b");
            }
        }

        if (a%2==0 && a%3==0){
            double c = Math.pow(a, b);
            if (c > Integer.MAX_VALUE || c < Integer.MIN_VALUE){
                System.out.println("Ямете кудасай");
            } else {
                System.out.println(c);
            }
        }
    }
}
