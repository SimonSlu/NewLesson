package lesson14.task1;

public class Square extends Figure{

    public Square(int size) {
        super(size);
    }
    public void drawMiddleLine (){
        System.out.print("|");
        for (int i = 0; i < this.getSize()-2; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
    }

    public void drawLine (){

        for (int i = 0; i <= this.getSize()-1; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    @Override
    public void draw() {
        this.drawLine();
        for (int i = 0; i < this.getSize()-2; i++){
            this.drawMiddleLine();
        }
        this.drawLine();

    }
}
