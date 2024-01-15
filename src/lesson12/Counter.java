package lesson12;

public class Counter {

    private String name;
    private int value;
    private String unit;

    public Counter(String name, int value, String unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;

        CounterService.saveCount(this);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
