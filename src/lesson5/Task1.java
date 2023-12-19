package lesson5;

public class Task1 {
    public static void main(String[] args) {
        char[] name = {'S', 'i', 'm', 'o', 'n'};

        for (char symbol: name) {
            System.out.print("" + symbol);
        }

        String nameStr = "";
        for (char symbol: name) {
            nameStr += symbol;
        }

        System.out.println('\n' + nameStr);
    }
}
