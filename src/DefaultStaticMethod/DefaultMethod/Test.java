package DefaultStaticMethod.DefaultMethod;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        // default method
        circle.setColor("Black");
    }
}
