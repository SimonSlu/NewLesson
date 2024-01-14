package lesson8;

public class Task1 {
    public static void main(String[] args) {

        Counter Chet = new Counter("Четное");
        Counter Nechet = new Counter("Нечетное");

        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                Chet.upOne();
            } else {
                Nechet.upOne();
            }
        }

        System.out.println(Chet.name + " " + Chet.count);
        System.out.println(Nechet.name + " " + Nechet.count);
    }
}
