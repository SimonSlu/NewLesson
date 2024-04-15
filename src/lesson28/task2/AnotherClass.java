package lesson28.task2;

public class AnotherClass <T>{
    private final T object;

    public T getObject() {
        return object;
    }

    public AnotherClass(T object) {
        this.object = object;
    }

    public boolean isNull(){
        return object == null;
    }
}
