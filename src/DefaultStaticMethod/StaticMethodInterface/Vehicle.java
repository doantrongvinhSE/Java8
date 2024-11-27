package DefaultStaticMethod.StaticMethodInterface;

public interface Vehicle {
    default void run() {
        System.out.println("Vehicle run");
    }

    // can't implement
    static boolean isValid() {
        System.out.println("Vehicle isValid");
        return true;
    }

    void showLog();
}
