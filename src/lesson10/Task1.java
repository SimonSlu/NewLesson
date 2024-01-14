package lesson10;

public class Task1 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
                primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNumbers[i - 1] + addingValue;
                primeNumbers[i] = FindNumber.findNextPrimeNumber(number, primeNumbers, i);
            }
        }

        System.out.println(FindNumber.sum(primeNumbers));

        FindNumber.sumAnyNumber();
    }

    //    В данном случае, рекурсивно реализован вызов проверки для нового числа в рамках
//    заполнения одного элемента массива

}
