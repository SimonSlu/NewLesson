package lesson34.task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите дату и время");
        Scanner scanner = new Scanner(System.in);
        String dateTime = scanner.nextLine();
        scanner.close();
        dateComparison(dateTime);

    }
        static void dateComparison (String text){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(text, dtf);
        LocalDateTime nowTime = LocalDateTime.now();
        if (ldt.isBefore(nowTime)){
            System.out.println("Введенная дата меньше текущей");
        }else {
            System.out.println("Введенная дата больше текущей");
        }
    }
}
