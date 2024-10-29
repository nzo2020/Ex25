public class Car extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("quickly");
    }

    @Override
    public void stop() {
        System.out.println("stopping smoothly");
    }

    @Override
    public void start() {
        System.out.println("starting with a roar of the engine");
    }
}
