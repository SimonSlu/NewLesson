package lesson20.task1;

import java.io.FileNotFoundException;
import java.util.Objects;

public class File {

    private String name;
    private int size;
    private Type type;
    //private java.io.FileNotFoundException FileNotFoundException;

    public File(String name, int size, Type type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size && Objects.equals(name, file.name) && type.equals(file.type);
    }

   public void nameSearch(String name) throws FileNotFoundException{
        if (getName().equals(name)){
            System.out.println(this);
        } else{
            throw new FileNotFoundException();
        }
   }
    /*public boolean SizeSearch(int size) throws FileNotFoundException{
        return getSize() == size;
    }
    public boolean typeSearch(Type type) throws FileNotFoundException{
        return getType().equals(type);
    }**/

    public void Search (File o) throws FileNotFoundException{
        if (this.equals(o)) {
            System.out.println(this);
        } else{
            throw new FileNotFoundException();
        }
    }
}
