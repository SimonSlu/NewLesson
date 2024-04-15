package lesson29.Task1;

public class Generic <T>{
    private final T object;

    public Generic(T object){
        this.object = object;
    }

    public T getObject(){
        return this.object;
    }
}
