import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        boolean isRunning = true;
        VehicleFactory vehicleFactory;
        while (isRunning) {
            System.out.println("Vehicle Rental System\n" +
                    "1. Rent a Car\n" +
                    "2. Rent a Bike\n" +
                    "3. Rent a Truck\n" +
                    "4. View Rented Vehicles\n" +
                    "5. Exit");
            System.out.println("Enter your choice: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    vehicleFactory = new CarFactory();
                    System.out.println("Enter Car Model: ");
                    String model= input.next();
                    System.out.println("Enter Rental Days: ");
                    int days=input.nextInt();
                    Car car = (Car) vehicleFactory.createVehicle(model,days);
                    vehicles.add(car);
                    car.displayDetails();
                    break;
                case 2:
                    vehicleFactory = new BikeFactory();
                    System.out.println("Enter Bike Brand: ");
                    String brand= input.next();
                    System.out.println("Enter Rental Hours: ");
                    int hours=input.nextInt();
                    Vehicle bike = vehicleFactory.createVehicle(brand,hours);
                    vehicles.add(bike);
                    bike.displayDetails();
                    break;
                case 3:
                    vehicleFactory = new TruckFactory();
                    System.out.println("Enter Truck Type: ");
                    String type= input.next();
                    System.out.println("Enter Rental Weeks: ");
                    int weeks=input.nextInt();
                    Vehicle truck = vehicleFactory.createVehicle(type,weeks);
                    vehicles.add(truck);
                    truck.displayDetails();
                    break;
                case 4:
                    if (vehicles.isEmpty()) {
                        System.out.println("You haven't added any vehicles");
                    } else {
                        for (Vehicle vehicle : vehicles) {
                            vehicle.displayDetails();
                            System.out.println("--------------------------");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    isRunning = false;
                    break;
            }
        }

    }
}