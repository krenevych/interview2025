
public class Bicycle extends Vehicle {
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void drive() {
        throw new IllegalStateException("Bicycles can't drive!");
    }

    public void ride() {
        System.out.println("Riding a bicycle...");
    }
}
