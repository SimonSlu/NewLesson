package lesson28.task2;

public class Main {
    public static void main(String[] args) {
        AnotherClass<Object> firstClass = new AnotherClass<>(new Object());
        AnotherClass<Object> nullClass = new AnotherClass<>(null);

        System.out.println(firstClass.isNull());
        System.out.println(nullClass.isNull());
    }
}
