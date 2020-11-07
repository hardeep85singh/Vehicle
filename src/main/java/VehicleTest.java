import javax.swing.*;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle vehicle = new VehicleImpl();

        vehicle.moveTo(4, 3);
        System.out.println(vehicle.totalDistanceCovered());
        vehicle.moveTo(0, 3);
        System.out.println(vehicle.getCurrentLocation());
    }
}
