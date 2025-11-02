public class Car implements Vehicle{
    private String model;
    private int days;

    public Car() {
    }

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return this.days*50;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details:\n" +
                            "Car Model: "+ this.model +
                            "\n Weekly Rental Rate: $50.0" +
                            "\n Rental Cost: $"+calculateRentalCost() +
                            "\n For "+this.days+" days");
    }
}
