//import java.util.ArrayList;
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.Random;
//
//public class VehicleManagerImpl implements VehicleManager, Vehicle {
//
//    private List<Point> vehiclePos = new ArrayList<>();
//    private List<Point> vehicleInRange = new ArrayList<>();
//    private List<Vehicle> vehicle = new ArrayList<>();
//    private double RADIUS;
//
//
//
//    /*
//     * Add vehicle to pool of vehicles
//     * @param Vehicle
//     * @return void
//     */
//    @Override
//    public void addVehicle(Vehicle vehicle) {
//        vehicle.add(vehicle);
//    }
//
//    /*
//     * Find vehicles nearest to location within some range
//     * @param Current location, range
//     * @return Vehicles
//     * */
//    @Override
//    public List<Vehicle> getNearest(Point p, int radius) {
//        addVehicleInRange(p);
//        return nearestVehicle(vehicleInRange, p);
//    }
//
//    private void addVehicleInRange(Point p) {
//        int i = 0;
//        while (i < vehiclePos.size()) {
//            double distance = p.distanceTo(vehiclePos.get(i));
//            if (distance <= RADIUS) {
//                vehicleInRange.add(vehiclePos.get(i));
//            }
//            i++;
//        }
//    }
//
//    private Point nearestVehicle(List<Point> vehicleInRange, Point p) {
//        int i = 0;
//        Point nearest = new Point(0, 0);
//        if (vehicleInRange.isEmpty()) {
//            throw new NoSuchElementException("No vehicle is present near your location");
//        }
//        while (i < vehicleInRange.size()) {
//            if (p.distanceTo(vehicleInRange.get(i)) < RADIUS) {
//                nearest = vehicleInRange.get(i);
//            }
//            i++;
//        }
//        return nearest;
//    }
//
//    @Override
//    public void moveTo(int x, int y) {
//
//    }
//
//    @Override
//    public Point getCurrentLocation() {
//        return null;
//    }
//
//    @Override
//    public double totalDistanceCovered() {
//        return 0;
//    }
//}
