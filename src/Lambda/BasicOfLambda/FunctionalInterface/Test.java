package Lambda.BasicOfLambda.FunctionalInterface;

public class Test {
    public static void main(String[] args) {
        SayAble sayable = () -> System.out.println("Say hello...");
        sayable.say();
        System.out.println("-".repeat(20));

        SayAble2 sayable2 = (name) -> "Hello " + name;
        String message = sayable2.say("Vinh");
        System.out.println(message);
        System.out.println("-".repeat(20));

        AddAble addDemo = (numberA, numberB) -> {
            System.out.println(numberA);
            System.out.println(numberB);
            return numberA + numberB;
        };
        int result = addDemo.add(1, 2);
        System.out.println(result);
    }
}
