package MethodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        list.forEach(number -> System.out.print(number + " "));

        // referrence to a static method
        list.forEach(System.out::println);

        Function<Integer, Double> fun = Math::sqrt;
        System.out.println(fun.apply(5)); //10

//        BiFunction<Integer, Integer, Integer> biFunc = (a, b) -> Demo.addition(a, b);
        BiFunction<Integer, Integer, Integer> biFunc = Demo::addition;
        System.out.println(biFunc.apply(2, 3));



        //  Reference to an instance method of an object
        Greeter greeter = new Greeter();
        List<String> names = List.of("Vinh", "KaKa", "Cris", "M10");
//        names.forEach(name -> greeter.greet(name));
        names.forEach(greeter::greet);




    }

    private static int addition(int a, int b) {
        return a + b;
    }
}

class Greeter {
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
}
