package lesson5;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int j = 1;
        for (int i = 0; i < arr.length; j++) {
            if (j == 1 || j == 2 || j == 3) {
                arr[i] = j;
                i++;
            } else if (j % 2 != 0 && j % 3 != 0) {
                arr[i] = j;
                i++;
            }

        }
        int arrSum = 0;
        for (int num: arr){
            arrSum += num;
        }
        System.out.println(arrSum);
    }
}
