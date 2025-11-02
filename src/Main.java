import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        boolean isRunning = true;
        VehicleFactory vehicleFactory = null;
        String vehicleType = "";
        int rentalTime = 0;
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
                    vehicleType= input.next();
                    System.out.println("Enter Rental Days: ");
                    rentalTime =input.nextInt();
                    break;
                case 2:
                    vehicleFactory = new BikeFactory();
                    System.out.println("Enter Bike Brand: ");
                    vehicleType= input.next();
                    System.out.println("Enter Rental Hours: ");
                    rentalTime=input.nextInt();
                    break;
                case 3:
                    vehicleFactory = new TruckFactory();
                    System.out.println("Enter Truck Type: ");
                    vehicleType= input.next();
                    System.out.println("Enter Rental Weeks: ");
                    rentalTime=input.nextInt();
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
            if (vehicleFactory!=null){
                Vehicle vehicle=vehicleFactory.callFactory(vehicleType,rentalTime);
                vehicles.add(vehicle);
                vehicle.displayDetails();
                vehicleFactory=null;
            }
        }

    }
}