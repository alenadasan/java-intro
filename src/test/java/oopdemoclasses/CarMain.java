package oopdemoclasses;

public class CarMain {

    public static void main(String[] args) {
        // static variable call (no new object needed)
        System.out.println(Car.producerResidence);

        Car townCar = new Car("Ford", "Fiesta");
        townCar.setNumberOfSeats(5);

        System.out.println("\nCar type: " + townCar.getCarType());
        System.out.println("Car origin: " + townCar.producerResidence);


        Car tourMinivan = new Car("Toyota", "Sienna");
        tourMinivan.setNumberOfSeats(9);

        System.out.println("\nCar type: " + tourMinivan.getCarType());
        System.out.println("Car origin: " + tourMinivan.producerResidence);
    }
}
