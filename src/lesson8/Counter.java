package lesson8;

import java.util.Scanner;

public class Counter {

    String name;
    int count;

    Counter (String name, int count){
        this.name = name;
        this.count = count;
    }

    Counter (String name){
        this.name = name;
        this.count = 0;
    }

    public int upOne (){
        this.count += 1;
        return this.count;
    }

    public int dawnOne (){
        this.count -= 1;
        return this.count;
    }

    public int upNumber (){
        System.out.println("Введи значение увелечения: ");
        Scanner sc = new Scanner(System.in);
        this.count += sc.nextInt();
        sc.close();
        return this.count;
    }

    public int dawnNumber (){
        System.out.println("Введи значение уменьшения: ");
        Scanner sc = new Scanner(System.in);
        this.count -= sc.nextInt();
        sc.close();
        return this.count;
    }
}
