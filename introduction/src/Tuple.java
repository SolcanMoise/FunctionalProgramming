/**
 * @author solcanm
 * @version 1.0
 * @since 2019-08-06
 */
class Tuple<T, U> {

    private final T _1;
    private final U _2;

    Tuple(T _1, U _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public T get_1() {
        return _1;
    }

    public U get_2() {
        return _2;
    }
}
