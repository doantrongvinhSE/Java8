package Lambda.BasicOfLambda.WriteSimpleLambdas;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, new CheckIfHopper());
        System.out.println("-".repeat(20));

        // thay vì phải viết thêm 1 class mới để checkIfSwimmer => dùng lambdas
        print(animals, a -> a.canSwim());

        // ởây a -> a.canSwim là bthuc lambdas đã implement Interface CheckTrait.


    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }
}
