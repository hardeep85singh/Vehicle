public class VehicleTest {
    public static void main(String[]args){
        Vehicle vehicle = new Point(0,0);

        vehicle.moveTo(4,3);
        vehicle.moveTo(0,3);
        vehicle.getCurrentLocation();
        //System.out.print(vehicle.totalDistanceCovered(vehicle.getCurrentLocation()));
    }
}
