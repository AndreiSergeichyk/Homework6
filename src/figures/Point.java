package figures;

public class Point {

    private double x;
    private double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point) {
        return Math.pow(Math.pow(Math.abs(this.x - point.getX()), 2) + Math.pow(Math.abs(this.y - point.getY()), 2), 0.5);
    }
}
