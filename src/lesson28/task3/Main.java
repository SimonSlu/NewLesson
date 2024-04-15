package lesson28.task3;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};
        ClassForArray<Integer> integerClassForArray = new ClassForArray<>(integers);

        int found = integerClassForArray.findElement(3);
        System.out.println(found);

        integerClassForArray.findElement(10);
    }
}
