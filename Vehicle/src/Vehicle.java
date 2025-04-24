abstract public class Vehicle {

    final protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void drive() {
        System.out.println("Just driving the vehicle...");
    }
}
