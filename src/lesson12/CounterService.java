package lesson12;

public class CounterService {

    private static Counter[] arrayOfCounters = new Counter[4];
    private static int count = 0;

    public static void saveCount(Counter counter) {
        arrayOfCounters[count] = counter;
        count++;
    }

    public static Counter getCounter(String counterName) {

        for (int i = 0; i < arrayOfCounters.length; i++) {
            if (arrayOfCounters[i].getName().equals(counterName)) {
                return arrayOfCounters[i];
            }
        }
        return null;
    }

    public static void incrementValue(Counter counter){
        counter.setValue(counter.getValue()+1);
    }

    public static void riseValue(Counter counter, int num){
        counter.setValue(counter.getValue()+num);
    }

    public static void zeroValue (Counter counter){
        counter.setValue(0);
    }
}



