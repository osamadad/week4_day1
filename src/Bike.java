public class Bike implements Vehicle{
    private String brand;
    private int hours;

    public Bike() {
    }

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return this.hours*10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details:\n" +
                            "Bike Model: "+ this.brand +
                            "\n Hourly Rental Rate: $10.0" +
                            "\n Rental Cost: $"+calculateRentalCost() +
                            "\n For "+this.hours+" hours");    }
}
