/**
 * Java functional interface and anonymous classes
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-13
 */
public interface Function {

    int apply(int arg);
}

class FunctionImpl {

    /**
     * Method to double an integer value
     */
    private static Function doubleVal = arg -> arg * 2;

    /**
     * Method to triple an integer value
     */
    private static Function tripleVal = arg -> arg * 3;

    /**
     * Composing function
     *
     * @param function1 the first function
     * @param function2 the second function
     * @return the composing function between function1 and function2
     */
    static Function compose(final Function function1, final Function function2) {
        return arg -> function1.apply(function2.apply(arg));
    }

    public static void main(String[] args) {
        System.out.println(doubleVal.apply(2));
        System.out.println(tripleVal.apply(3));
        System.out.println(compose(tripleVal, doubleVal).apply(4));
    }
}
