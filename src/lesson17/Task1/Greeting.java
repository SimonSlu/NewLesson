package lesson17.Task1;

public enum Greeting {
    HELLO("Hello"),
    BYE("Good bye"),
    HOW("How are you");

    String word;

    Greeting(String word){
        this.word=word;
    }

    public String getWord(){
        return word;
    }
}
