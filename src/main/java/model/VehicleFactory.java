package model;

public abstract class VehicleFactory {

    public Vehicle orderVehicle(){
        Vehicle vehicle = createVehicle();
        vehicle.showVehicleType();
        return vehicle;
    }

    public abstract Vehicle createVehicle();

}
