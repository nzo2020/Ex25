public class Motorcycle extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("rapidly");
    }

    @Override
    public void stop() {
        System.out.println("stopping quickly");
    }

    @Override
    public void start() {
        System.out.println("starting with a rev");
    }
}