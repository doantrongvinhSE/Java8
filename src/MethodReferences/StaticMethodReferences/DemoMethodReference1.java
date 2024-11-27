package MethodReferences.StaticMethodReferences;

public class DemoMethodReference1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        int result = doAction(a, b, MathUtils::subtract);
        System.out.println(result);
    }


    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }
}
