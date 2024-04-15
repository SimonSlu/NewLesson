package lesson28.task3;

public class ElementNotFindException extends RuntimeException{
    public ElementNotFindException(){
        super ("element not found");
    }
}
