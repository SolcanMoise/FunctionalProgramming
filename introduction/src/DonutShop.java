import java.util.Collections;
import java.util.List;

/**
 * @author solcanm
 * @version 1.0
 * @since 2019-08-06
 */
public class DonutShop {

    /**
     * Buying a {@link Donut}
     *
     * @param creditCard the card used for payment
     * @return a generic class that contains {@link Donut} and {@link Payment} details
     */
    public static Tuple<Donut, Payment> buyDonut(final CreditCard creditCard) {
        return new Tuple<>(new Donut(), new Payment(creditCard, Donut.price));
    }

    /**
     * Buying multiple {@link Donut} at once
     *
     * @param quantity   the number of Donuts
     * @param creditCard the card to be used for payment
     * @return {@see Tuple class}
     */
    public static Tuple<List<Donut>, Payment> buyDonuts(final int quantity, final CreditCard creditCard) {
        return new Tuple<>(Collections.nCopies(quantity, new Donut()), new Payment(creditCard, Donut.price * quantity));
    }

}
