import java.util.List;

/**
 * Functional methods
 * A method can be functional if it respects the requirements of a pure function:
 * - It must not mutate anything outside the function. No internal mutation may be visible from the outside.
 * - It must not mutate its arguments
 * - It must not throw errors or exceptions
 * - It must always return a value
 * - When called with the same arguments, it must always return the same result.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-13
 */
public class FunctionalMethods {

    public int percent1 = 5;
    private int percent2 = 9;
    private final int percent3 = 13;

    // this is a function
    public int add(final int a, final int b) {
        return a + b;
    }

    public void setPercent2(int value) {
        percent2 = value;
    }

    // this is a function: f(x) = 10
    public int mult(int a, Integer b) {
        a = 5;
        b = 2;
        return a * b;
    }

    // this is't a function, because it will throw an exception if if the divisor is 0.
    public int div(int a, int b) {
        return a / b;
    }

    // it's not a pure function because percent1 can be modified
    public int applyTax1(int a) {
        return a / 100 * (100 + percent1);
    }

    // it's not a pure function because percent2 can be modified
    public int applyTax2(int a) {
        return a / 100 * (100 + percent2);
    }

    // this is a function
    public int applyTax3(int a) {
        return a / 100 * (100 + percent3);
    }

    // it's not a function, because mutates its argument before returning it
    public List<Integer> append(int i, List<Integer> list) {
        list.add(i);
        return list;
    }

}
