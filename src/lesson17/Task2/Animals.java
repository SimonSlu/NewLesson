package lesson17.Task2;

public enum Animals {
    CAT("miau"),
    DOG("woof"),
    COW("moo");

    String sound;

    Animals(String sound){
        this.sound=sound;
    }
    String getSound(){
        return sound;
    }
}
