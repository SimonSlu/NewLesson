package lesson28;

public class Task1 {
    public static void main(String[] args) {
        SomeClass<Integer> intNumber = new SomeClass<>(5);
        SomeClass<Double> doubleNumber = new SomeClass<>(5d);
        SomeClass<Float> floatNumber = new SomeClass<>(5f);
        SomeClass<Long> longNumber = new SomeClass<>(5L);

        System.out.println(intNumber.getPow(2));
        System.out.println(doubleNumber.getPow(2));
        System.out.println(floatNumber.getPow(2));
        System.out.println(longNumber.getPow(2));
    }
}


class SomeClass <T extends Number>{
    private final T number;

    public SomeClass(T number){
        this.number = number;
    }

    public T getNumber(){
        return number;
    }

    public double getPow(double pow){
        return Math.pow(number.doubleValue(), pow);
    }
}