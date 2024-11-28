package Lambda.BasicOfLambda.LambdaExample;

public interface Shape {
    void draw();
}

// dont need
//class Square implements Shape{
//
//    @Override
//    public void draw() {
//    }
//}
//
//class Triangle implements Shape{
//
//    @Override
//    public void draw() {
//
//    }
//}

class Test {
    public static void main(String[] args) {
        Shape shape = () -> System.out.println("Shape draw");
//        shape.draw();

//       Triangle triangle = () -> System.out.println("hehe"); wrong

        Shape circle = () -> System.out.println("Circle draw");
//        circle.draw();

        Shape rectangle = () -> System.out.println("Rectangle draw");
//        rectangle.draw();

        // pass lambda method to parameter
        printShape(() -> System.out.println("Shape draw"));
        printShape(() -> System.out.println("Circle draw"));
        printShape(rectangle);
    }

    private static void printShape(Shape shape) {
        shape.draw();
    }
}
