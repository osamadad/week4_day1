public class Truck implements Vehicle{
    private String type;
    private int weeks;

    public Truck() {
    }

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        return this.weeks *500;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rental Details:\n" +
                            "Truck Model: "+ this.type +
                            "\n Daily Rental Rate: $500.0" +
                            "\n Rental Cost: $"+calculateRentalCost() +
                            "\n For "+this.weeks +" weeks");    }
}
