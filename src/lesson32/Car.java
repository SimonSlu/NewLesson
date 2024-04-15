package lesson32;

public class Car {
    private String model;
    private String color;
    private String number;

    public Car() {
    }

    public Car(String model, String color, String number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return color + ";" + model + ";" + number + "\n";
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
