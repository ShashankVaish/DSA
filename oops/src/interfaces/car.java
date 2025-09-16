package interfaces;

public class car implements brake,engine,media{
    @Override
    public void start() {
        System.out.println("start the engine ");
    }

    @Override
    public void stop() {
        System.out.println("the stop engine");

    }

    @Override
    public void acc() {
        System.out.println("the accelate the car");

    }

    @Override
    public void rpm() {
        System.out.println("the rpm per unit cycle is 12 rpm");

    }

    @Override
    public void brake() {
        System.out.println("the brake of teh car is good");
    }
}
