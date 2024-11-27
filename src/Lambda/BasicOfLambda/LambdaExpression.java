package Lambda.BasicOfLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C#", "C++", "Python", "PHP");

        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));

        // lambda with forEach
        list.forEach(n -> System.out.println(n));


    }
}
