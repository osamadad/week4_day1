public class TruckFactory extends VehicleFactory{

    @Override
    public Vehicle callFactory(String type,int week) {
        return new Truck(type,week);
    }
}
