package lesson32;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Car[] garage = new Car[10];
    static Car[] parking = new Car[10];
    static String carText = "";

    public static void main(String[] args) {

        garage[0] = new Car("Mazda", "white", "A063AP063");
        garage[1] = new Car("BMW", "black", "A163AP163");
        garage[2] = new Car("Submarine", "Yellow", "beatles");

        try(FileOutputStream fos = new FileOutputStream(".\\resorce\\lesson32.txt");
            FileInputStream fis = new FileInputStream(".\\resorce\\lesson32.txt")){

            System.out.println("Начало записи файла");
            for(Car car: garage){
                if (car == null){
                    break;
                }
                fos.write(car.toString().getBytes());
            }
            System.out.println("Данные записаны\n");

            System.out.println("Начало чтения из файла");
            byte[] buffer = new byte[256];
            int count;

            while((count = fis.read(buffer)) != -1){
                for (int i = 0; i < count; i++){
                    carText+=(String.valueOf((char)buffer[i]));
                }
            }
            Pattern pattern = Pattern.compile("\\n");
            //Matcher matcher = pattern.matcher(carText);
            String[] carString = pattern.split(carText);
            int numberOfCar = 0;
            for(String carOptions: carString){
                Pattern p = Pattern.compile(";");
                String[] carWords = p.split(carOptions);
                parking[numberOfCar]= new Car(carWords[1], carWords[0], carWords[2]);
                numberOfCar++;
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }finally {
            System.out.print(carText);
            System.out.println("Данные записаны и прочитаны");
        }
        for (Car car: parking){
            if(car==null){
                break;
            }
            System.out.print(car.toString());
        }

    }
}
