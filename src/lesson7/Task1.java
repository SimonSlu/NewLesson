package lesson7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getText("a", "b", "c", "slovo"));
    }

    static String getText(String ... words) {

        String text = "";

        for (String word: words) {
            text += word + " ";
        }

        return text;
    }
}
