package lesson29.Task1;

public class Main {
    public static void main(String[] args) {
        Generic<Integer> generic1 = new Generic<>(5);
        System.out.println(getOrDefault(generic1, 10));

        Generic<Integer> generic2 = new Generic<>(null);
        System.out.println(getOrDefault(generic2, 10));

    }

    public static <T> T getOrDefault (Generic<T> object, T defaultObject){
        return object.getObject() != null ? object.getObject() : defaultObject;
    }
}
