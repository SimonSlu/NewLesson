package lesson33.task1;

import java.io.File;

public class Main {
    static Car[] garage1 = new Car[3];
    static Car[] garage2 = new Car[3];
    static Car[] garage3 = new Car[3];
    static Car[] parking = new Car[10];
    static String carText = "";

    static final String FILE_PATH = ".\\resorce\\lesson33CarList.txt";
    static File file = new File(FILE_PATH);
    public static void main(String[] args) {
        garage1[0] = new Car("Mazda", "white", "A063AP063");
        garage1[1] = new Car("BMW", "black", "A163AP163");
        garage1[2] = new Car("Submarine", "Yellow", "beatles");

        garage2[0] = new Car("Lada", "white", "A063AP063");
        garage2[1] = new Car("Lada", "black", "A163AP163");
        garage2[2] = new Car("Lada", "Yellow", "beatles");

        garage3[0] = new Car("Pixy", "white", "A063AP063");
        garage3[1] = new Car("Pixy", "black", "A163AP163");
        garage3[2] = new Car("Pixy", "Yellow", "beatles");

        TextWriter.firstWriter(file, garage1);
        TextWriter.secondWriter(file, garage2);
        TextWriter.thirdWriter(file, garage3);

    }
}
