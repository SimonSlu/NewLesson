package lesson7;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
    static int result;
    static int factorial (int x){
        if(x == 0){
            return 1;
        }

        if (x == 1) {
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }
}
