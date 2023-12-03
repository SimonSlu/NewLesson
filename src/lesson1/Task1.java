package lesson1;

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c;

        c = a;
        a=b;
        b=c;

        System.out.println("Значение а: " + a + " значение b: " + b);
    }
}
