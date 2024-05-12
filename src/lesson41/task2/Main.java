package lesson41.task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter words:");
        String[] words = scanner.nextLine().trim().toLowerCase().split(" ");
        scanner.close();
        Set<String> setOfWords = new HashSet<>();
        for(String word: words){
            setOfWords.add(word);
        }
        System.out.printf("Количество уникальных слов: %d", setOfWords.size());
    }
}
