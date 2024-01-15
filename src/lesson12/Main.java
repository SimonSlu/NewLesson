package lesson12;

public class Main {
    public static void main(String[] args) {
        Counter Gaz = new Counter("Газ", 100, "m3");
        Counter Voda = new Counter("Вода", 20, "m3");

        display(CounterService.getCounter("Газ"));
        CounterService.incrementValue(CounterService.getCounter("Газ"));
        display(CounterService.getCounter("Газ"));
        CounterService.zeroValue(Gaz);
        display(CounterService.getCounter("Газ"));


    }

    private static void display(Counter counter){
        System.out.printf("%s: %d%s \n", counter.getName(), counter.getValue(), counter.getUnit());
    }
}
