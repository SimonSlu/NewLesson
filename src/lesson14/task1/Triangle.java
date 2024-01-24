package lesson14.task1;

public class Triangle extends Figure{
    public Triangle(int size) {
        super(size);
    }

    @Override
    public void draw(){
        int edge = getSize() ;

        for (int i = 0; i < getSize(); i++){
            drawSpace(edge);
            System.out.print("/");
            drawSpace(i*2);
            System.out.println("\\");
            edge--;
        }
        drawBottom(getSize());
    }

    public void drawSpace(int num){
        for (int i = 0; i < num; i++){
            System.out.print(" ");
        }
    }

    public void drawBottom(int num){
        for (int i = 0; i < num*2+2; i++){
            System.out.print("_");
        }
        System.out.println();
    }
}
