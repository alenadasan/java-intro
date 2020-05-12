package c02.classes;

public class User {

    String name;
    String address;
    int orderID;
    boolean isActive;

    public void setAddress(String add) {
        address = add;
    }

    public void setOrderID(int id) {
        orderID = id;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Order ID: " + orderID);
        System.out.println("Is active: " + isActive);
    }
}
