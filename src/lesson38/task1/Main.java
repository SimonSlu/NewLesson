package lesson38.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(7, "green", 1999));
        cars.add(new Car(3, "black", 2027));
        cars.add(new Car(8, "white", 2023));
        cars.add(new Car(1, "gray", 123));
        cars.add(new Car(75, "pink", 2023));
        cars.add(new Car(1, "fuxia", 2000));

        for(Car car: cars){
            System.out.println(car);
        }
        System.out.println();

        cars.sort(new CarIdComparator());
        for(Car car: cars){
            System.out.println(car);
        }
        System.out.println();

        cars.sort(new CarYearComparator().thenComparing(new CarIdComparator()));
        for(Car car: cars){
            System.out.println(car);
        }

    }
}
