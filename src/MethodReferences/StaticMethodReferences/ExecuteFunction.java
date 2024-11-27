package MethodReferences.StaticMethodReferences;

@FunctionalInterface
public interface ExecuteFunction {
    int execute(int a, int b);
}

class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}

