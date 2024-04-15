import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        f.format("%-15s %5s %10s\n", "Item", "QTY", "Price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }
}