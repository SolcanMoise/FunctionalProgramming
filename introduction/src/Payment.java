import java.util.List;

/**
 * @author solcanm
 * @version 1.0
 * @since 2019-08-06
 */
class Payment {

    private final CreditCard creditCard;
    private final int amount;

    Payment(CreditCard creditCard, int amount) {
        this.creditCard = creditCard;
        this.amount = amount;
    }

    /**
     * Composing multiple payments into single one
     *
     * @param payment the payment to combine with actual one
     * @return a new Payment instance.
     */
    public Payment combine(Payment payment) {
        if (creditCard.equals(payment.creditCard)) {
            return new Payment(creditCard, amount + payment.amount);
        } else {
            throw new IllegalStateException("Cards don't match!");
        }
    }
}
