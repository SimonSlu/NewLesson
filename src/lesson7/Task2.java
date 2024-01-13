package lesson7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var x = sc.next();
        var y = sc.next();
        System.out.println(sum(x, y));
    }
    static int sum(int a, int b){
        return a+b;
    }
    static short sum(short a, short b){
        return (short) (a+b);
    }
    static boolean sum(boolean a, boolean b){
        return a&&b;
    }
    static String sum(char a, char b){
        String str = "" + a + b;
        return str;
    }
    static String sum(String a, String b){
        String str = "" + a + b;
        return str;
    }
}
