package lesson30.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        String text = "Слу-цкий Се---мен Владимирович";

        System.out.println(getFullName(text));

    }

    public static FullName getFullName (String text) throws Exception {
        Pattern pattern1 = Pattern.compile("[А-Я]\\D*\\s[А-Я]\\D*\\s[А-Я]\\D*");
        Pattern pattern2 = Pattern.compile("[А-Я]\\D*-[А-Я]\\D*\\s[А-Я]\\D*\\s[А-Я]\\D*");
        Matcher matcher1 = pattern1.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);

        String[] fio;

        if(matcher1.matches()){
            fio = text.split(" ");
        } else if (matcher2.matches()) {
            fio = text.split(" ");
        } else {
            throw new Exception();
        }
        return new FullName(fio[0], fio[1], fio[2]);


    }
}
