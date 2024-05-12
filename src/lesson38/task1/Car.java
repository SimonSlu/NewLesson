package lesson38.task1;

public class Car {
    private int identifier;
    private String color;
    private int year;

    public Car(int identifier, String color, int year) {
        this.identifier = identifier;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "№" + identifier +
                " " + color +
                " " + year +
                '}';
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
