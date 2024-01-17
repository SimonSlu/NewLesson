package lesson13.task1;

public class Dog extends Animal{

    private Dog(){
        System.out.println("I’m a dog");
    }

    public Dog (String color){
        super();
        System.out.printf("I'm a %s dog \n", color);
    }
}
