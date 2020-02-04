package oopdemoclasses;

public class Car {

    private String brand;
    private String model;
    private String color;

    public static String producerResidence = "Germany";

    private int seats;

    public Car() {
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfSeats(int seats) {
        this.seats = seats;
    }

    public String getCarType() {
        String carType = "";

        if(seats >= 7)
            carType = "Minivan";
        else
            carType = "Regular car";

        return carType;
    }
}
