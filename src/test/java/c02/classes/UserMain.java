package c02.classes;

public class UserMain {

    public static void main(String[] args) {
        User firstUser = new User();

        firstUser.setName("Larry");
        firstUser.setAddress("Timisoara");
        firstUser.setActive(true);

        firstUser.addOrderID(1004);
        firstUser.addOrderID(1007);

        firstUser.displayInfo();
    }
}
