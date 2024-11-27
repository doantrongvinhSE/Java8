package DefaultStaticMethod.ConflictDefaultMethod;

public class MultiInheritance implements Interface1, Interface2 {
    @Override
    public void method1() {

    }

    @Override
    public void doSomething() {
        Interface1.super.doSomething();
        Interface2.super.doSomething();
    }

    @Override
    public void method2() {

    }
}
