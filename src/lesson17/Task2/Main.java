package lesson17.Task2;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = Animals.values();

        for(Animals sound: animals){
            System.out.println(sound.getSound());
        }
    }
}
