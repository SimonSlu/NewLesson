package lesson17.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        final String WORD1 = "Hi";
        final String WORD2 = "Bye";
        final String WORD3 = "How are you";

        Scanner scanner = new Scanner(System.in);
        String slovo = scanner.nextLine();

        if (slovo.equals(WORD1)){
            System.out.println("Hello");
        } else if (slovo.equals(WORD2)){
            System.out.println("Good bye");
        } else if (slovo.equals(WORD3)){
            System.out.println("How are your doing");
        } else {
            System.out.println("Unknown message");
        }

        switch (slovo){
            case (WORD1):
                System.out.println(Greeting.HELLO.getWord());
                break;
            case (WORD2):
                System.out.println(Greeting.BYE.getWord());
                break;
            case (WORD3):
                System.out.println(Greeting.HOW);
                break;
            default:
                System.out.println("Unknown message");
        }
    }
}
