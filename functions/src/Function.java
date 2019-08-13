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
    private static Function square = arg -> arg * 2;

    /**
     * Method to triple an integer value
     */
    private static Function triple = arg -> arg * 3;

    public static void main(String[] args) {
        System.out.println(square.apply(2));
        System.out.println(triple.apply(3));
    }
}
