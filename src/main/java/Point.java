public class Point implements Vehicle {//change name
    private int X; //should be small
    private int Y;
//    private Point point;
    private double distanceCovered = 0;

    public Point() {
        X = 0;
        Y = 0;
    }

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public Point(Point point) {
        this.X = point.X;
        this.Y = point.Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

//    public double distance(int X, int Y) {
//        double dist = Math.sqrt(Math.pow((this.X - X), 2) + Math.pow((this.Y - Y), 2));
//        distanceCovered = distanceCovered + dist;
//        return dist;
//    }
//
//    public double distance(Point p) {
//        double dist = Math.sqrt(Math.pow((X - p.X), 2) + Math.pow((Y - p.Y), 2));
//        distanceCovered = distanceCovered + dist;
//        return dist;
//    }

    public void moveTo(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public Point getCurrentLocation() {
        Point p = new Point(this.X, this.Y);
        return p;
    }

    public double totalDistanceCovered(Point p) {

        return 0;
    }
}
