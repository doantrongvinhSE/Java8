package DefaultStaticMethod.ConflictDefaultMethod;

public interface Interface2 {
    void method2();

    default void doSomething() {
        System.out.println("Interface2 do something!");
    }
}
