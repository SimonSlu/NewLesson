package lesson18.ins;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[] {new Cow(), new Cow(), new Dog(), new Cat() };

        getSound(animals);

    }

    public static void getSound(Animal[] animals){
        for(Animal animal: animals){
            if(animal instanceof Cat catAnimal){
                catAnimal.sound();
            } else if (animal instanceof Dog dogAnimal){
                dogAnimal.sound();
            } else if (animal instanceof Cow cowAnimal){
                cowAnimal.sound();
            }
        }
    }
}
