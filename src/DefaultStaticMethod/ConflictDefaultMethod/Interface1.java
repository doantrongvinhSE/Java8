package DefaultStaticMethod.ConflictDefaultMethod;

public interface Interface1 {
    void method1();

    default void doSomething() {
        System.out.println("Interface1 do something!");
    }

}
