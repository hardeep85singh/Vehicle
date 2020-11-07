public class Point{

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }


    public Point translate(int dx, int dy){
        return null;
       // this.x = x + dx;
       // this.y = y + dy;
    }

    public double distanceTo(Point p){
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public String toString(){
        return "(" + x + "," + y +")";
    }
}
