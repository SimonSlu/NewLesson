package lesson20.task1;

import java.io.FileNotFoundException;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        File[] files = new File[]{new File("Diplom", 1000, Type.TEXT),
                                    new File("ShakeraShakera", 1024, Type.AUDIO),
                                    new File("mem pro kotika", 2000, Type.IMAGE)};

        File findFile = new File("mem pr kotika", 2000, Type.IMAGE);

        try{
            FileSearch.search(files, findFile);
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }


            /**for(File f: files){
                try{
                    f.nameSearch("mem pro kotika");

                    break;
            } catch(FileNotFoundException e){
                    System.out.println("Файл не найден");

                }
        }

            File iskomoe = new File("Diplom", 1000, Type.TEXT);

        for(File f: files){
            try{
                f.Search(iskomoe);

                break;
            } catch(FileNotFoundException e){
                e.printStackTrace();
                break;
            }
        }**/
    }
}
