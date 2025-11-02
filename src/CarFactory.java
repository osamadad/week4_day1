public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle callFactory(String model,int days) {
        return new Car(model,days);
    }
}
