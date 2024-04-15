package lesson33.task2;

import java.io.File;

public class Main {
    static final String FILE_PATH = ".\\resorce\\lesson33CarList.txt";
    static File file = new File(FILE_PATH);

    public static void main(String[] args) {
        System.out.println(TextReader.firstReader(file));
        System.out.println(TextReader.secondReader(file));
        System.out.println(TextReader.thirdReader(file));
    }
}
