package lesson33.task1;

import java.io.*;

public class TextWriter {



    public static void firstWriter (File file, Car[] cars){
        String text = "";

        for(Car car: cars){
            text += car.toString();
        }

        try(FileWriter writer = new FileWriter(file)){
            writer.write(text);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void secondWriter (File file, Car[] cars){
        String text = "";

        for(Car car: cars){
            text += car.toString();
        }

        try(FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos)){
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void thirdWriter (File file, Car[] cars){
        String text = "";

        for(Car car: cars){
            text += car.toString();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){

            bw.write(text);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
