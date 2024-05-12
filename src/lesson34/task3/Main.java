package lesson34.task3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

    }

    static void differenceDate(LocalDateTime date1, LocalDateTime date2){
        if(date1.isBefore(date2)){
            int year = date2.getYear() - date1.getYear();

        }
    }
}
