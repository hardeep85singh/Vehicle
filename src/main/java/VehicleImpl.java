import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

public class VehicleImpl implements Vehicle {

    private List<Point> positions = new ArrayList<Point>();
    private double distance;
    private Point current = null;

    public VehicleImpl(Point p) {
        positions.add(p);
        current = p;
    }

    public VehicleImpl() {
        current = new Point(0, 0);
    }

    public void moveTo(int x1, int y1) {
        Point p = new Point(x1, y1);
        distance = distance + current.distanceTo(p);
        positions.add(p);
        current = p;
    }

    public Point getCurrentLocation() {// Problem
        return current;
    }

    public double totalDistanceCovered() {
        return distance;
    }

}
