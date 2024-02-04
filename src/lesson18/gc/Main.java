package lesson18.gc;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[] {new Cow(), new Cow(), new Dog(), new Cat() };

        getSound(animals);

        System.out.println(animals[1].getClass());

    }

    public static void getSound(Animal[] animals){
        for(Animal animal: animals){
            if(animal.getClass().equals(Cat.class)){
                ((Cat)animal).sound();
            } else if (animal.getClass().equals(Dog.class)){
                animal.sound();
            } else if (animal.getClass().equals(Cow.class)){
                animal.sound();
            }
        }
    }
}
