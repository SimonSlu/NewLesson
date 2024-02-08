package lesson20.task1;

import java.io.FileNotFoundException;

public class FileSearch {

    //private boolean flag = false;

    public static void search(File[] files, File file) throws FileNotFoundException{
        for(int i = 0; i< files.length; i++) {
            if (files[i].equals(file)) {
                System.out.println(file);
                break;
            }
            if (i == (files.length - 1)) {
                throw new FileNotFoundException();
            }
        }
    }
}
