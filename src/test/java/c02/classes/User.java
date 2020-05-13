package c02.classes;

import java.util.ArrayList;
import java.util.List;

public class User {

    String name;
    String address;
    List<Integer> orderIDs;
    boolean isActive;

    public User() {
        orderIDs = new ArrayList<Integer>();
    }

    public void setAddress(String add) {
        address = add;
    }

    public void addOrderID(int id) {
        orderIDs.add(id);
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
        System.out.println("Is active: " + isActive);

        System.out.print("Order IDs: ");
        for (Integer id : orderIDs) {
            System.out.print(id + " ");
        }
    }
}
