public class Bicycle extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("at a moderate pace");
    }

    @Override
    public void stop() {
        System.out.println("slowly");
    }

    @Override
    public void start() {
        System.out.println("starting to pedal");
    }
}
