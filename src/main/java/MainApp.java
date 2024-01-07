import model.CarFactory;
import model.TruckFactory;
import model.Vehicle;
import model.VehicleFactory;

public class MainApp {

    public static void main(String[] args) {

        /*
        * This is a example of implementation from factory method.
        *
        * Pros: You avoid coupling
        *       Single responsabilty principle
        *       Open/Closed principle
        *
        * Cons: The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern.
        *       The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.
        * */



        VehicleFactory carCreator = new CarFactory();
        Vehicle car = carCreator.createVehicle();
        car.showVehicleType();

        VehicleFactory truckCreator = new TruckFactory();
        Vehicle truck = truckCreator.createVehicle();
        truck.showVehicleType();

    }

}
