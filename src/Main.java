import figures.Point;
import figures.Rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(1, 4), new Point(5, 1));

        System.out.println("Площадь прямоугольника равна: " + rectangle.getSquare());
        System.out.println("Диагональ прямоугольника равна: " + rectangle.getDiagonal());
    }
}
