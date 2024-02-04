package lesson14.task1;

public abstract class Figure {
    private int size;

    public int getSize(){
        return this.size;
    }
    public Figure (int size){
        this.size = size;
    }

    public abstract void draw ();


}
