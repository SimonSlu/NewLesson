package lesson14.task2.task2;

public class Main {
    public static void main(String[] args) {

        Animal[] arr = new Animal[]{new Cat(), new Cat(), new Dog(), new Cow(), new Dog()};
        makeSomeNoise(arr);

    }

    static void makeSomeNoise(Animal[] animals) {


        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
