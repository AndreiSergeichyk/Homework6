package figures;

public class Rectangle {

    private Point upperLeftPoint;
    private Point bottomRightPoint;

    public Rectangle(Point upperLeftPoint, Point bottomRightPoint) {
        this.upperLeftPoint = upperLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    public double getSquare() {
        double width = bottomRightPoint.getX() - upperLeftPoint.getX();
        double height = upperLeftPoint.getY() - bottomRightPoint.getY();

        return width * height;
    }

    public double getDiagonal() {
        return upperLeftPoint.distance(bottomRightPoint);
    }
}
