package lesson6;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        doChoice(editArray());
    }


    static int[] editArray() {
        int[] arr = new int[2];
        Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter a: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
        System.out.print("Enter a: ");
//        Объявляем переменную a типа int и записываем в нее значение, введенное с клавиатуры
        arr[0] = scanner.nextInt();

//        Повторяем те же действия для b
        System.out.print("Enter b: ");
        arr[1] = scanner.nextInt();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
        scanner.close();
        return arr;
    }

    static void doChoice(int[] arr) {
//        Если а - четное ИЛИ b - кратно трем
        if (arr[0] % 2 == 0 || arr[1] % 3 == 0) {
            System.out.println(arr[0] == arr[1]);
        }

        if (arr[0] % 2 == 0 && arr[0] % 3 == 0) {    // Данную проверку можно оптимизировать как a % 6 == 0
//            Записываем в переменную result результат возведения a в степень b
//            Тип double был использован, потому что Math.pow() возвращает именно его.
//            В остальном нам подошел бы и long
            double result = Math.pow(arr[0], arr[1]);

//            Если результат превышает допустимые размеры для int
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {    //в ином случае
//                Каст к int необязателен, но позволяет избежать выведения в консоль дробной части
                System.out.println((int) result);
            }
        }
    }


}
