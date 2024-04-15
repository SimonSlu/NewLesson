package lesson33.task2;

import java.io.*;

public class TextReader {

    public static String firstReader (File file){
        String text = "";
        try(FileReader reader = new FileReader(file)){
            int c;
            while((c = reader.read())!=-1){
                text += (char)c;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return text;
    }

    public static String secondReader (File file){
        String text = "";
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
            int c;
            while((c= bis.read())!=-1){
                text += (char)c;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return text;
    }

    public static String thirdReader (File file){
        String text = "";
        String str = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            while((str = br.readLine())!=null){
                text += str;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return text;
    }
}
