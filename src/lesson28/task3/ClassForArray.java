package lesson28.task3;

import java.util.Objects;
import lesson28.task3.ElementNotFindException;

public class ClassForArray <T> {

    private final T[] array;

    public ClassForArray (T[] array){
        this.array = array;
    }

    public T findElement(T element){
        for(T el: array){
            if(Objects.equals(el, element)){
                return el;
            }
        }
        throw new ElementNotFindException();
    }
}
