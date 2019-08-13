/**
 * Polymorphic functions
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-13
 */
public interface PolymorphicFunction<T, U> {

    U apply(T arg);
}

class PolymorphicImpl {

    private PolymorphicFunction<Integer, Integer> increase = arg -> arg + 1;
    private PolymorphicFunction<Integer, Integer> decrease = arg -> arg - 1;

    private static void testFunctions() {
        PolymorphicImpl impl = new PolymorphicImpl();
        System.out.println(impl.increase.apply(3));
        System.out.println(impl.decrease.apply(3));
    }

    public static void main(String[] args) {
        testFunctions();
    }
}
