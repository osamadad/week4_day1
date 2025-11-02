public abstract class VehicleFactory {

    public Vehicle createVehicle(String vehicleType,int rentalTime){
        return callFactory(vehicleType, rentalTime);
    }

    public abstract Vehicle callFactory(String vehicleType,int rentalTime);

}
