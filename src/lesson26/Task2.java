package lesson26;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи слова");

        String[] words = sc.nextLine()
                .strip()
                .toLowerCase()
                .split(" ");

        int count = 0;


        int i = 0;
        for(String word: words){
            i++;
            for(int j = i; j < words.length; j++){
                if (word == null){
                    continue;
                }
                if (word.equals(words[j])){
                    words[j] = null;
                }
            }
        }
        for(String str: words){
            System.out.println(str);
        }
        System.out.println(words.length);

        for (String word: words){
            if(word != null && !word.isEmpty()){

                count++;
            }
        }
        System.out.println(words[0].isEmpty());

        //System.out.println(String.valueOf(words[0] =="" ? "Yes":"No"));

        System.out.println("Количество уникальных слов в строке " + (count));
        //System.out.println(String.valueOf(words[0]));
    }
}
