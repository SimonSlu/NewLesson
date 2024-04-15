package lesson30.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String phoneNumber = "+7 (987) 955-41-71";
        if (validNumber(phoneNumber)){
            System.out.println("номер соответсвует шаблону");
        }else {
            System.out.println("просто набор символов");
        }
    }

    private static boolean validNumber (String phoneNumber){
        Pattern pattern = Pattern.compile("\\+7\\s\\(\\d{3}\\)\\s\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
