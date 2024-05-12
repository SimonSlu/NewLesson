package lesson34.task1;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dateTime = scanner.nextLine();
        scanner.close();

        System.out.println(parsingDate(dateTime));
    }
        static LocalDateTime parsingDate (String text){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(text, dtf);
        return ldt;
    }
}
