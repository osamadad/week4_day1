public class BikeFactory extends VehicleFactory{

    @Override
    public Vehicle callFactory(String brand,int hours) {
        return new Bike(brand,hours);
    }
}
