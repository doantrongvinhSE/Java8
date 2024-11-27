package DefaultStaticMethod.StaticMethodInterface;

public class Bike implements Vehicle{
    @Override
    public void showLog() {
        System.out.println("Bike Log");
        run();
        Vehicle.isValid();
    }


}
