package lesson19;

import java.util.Objects;

public class Car {

    private String number;
    private String model;

    public Car(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return  "number: " + number + '\'' +
                "model: " + model + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(number, car.number) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model);
    }
}


