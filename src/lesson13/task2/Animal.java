package lesson13.task2;

public class Animal {

    String kind;

    public String getKind(){
        return this.kind;
    }

    void sound(){

        switch(this.getKind()){
            case("cat"):
                ((Cat) this).meow();
                break;
            case("dog"):
                ((Dog) this).woof();
                break;
            case("cow"):
                ((Cow) this).moo();
                break;
            default:
                System.out.println("неизвестное животное");
                break;
        }
    }
}
