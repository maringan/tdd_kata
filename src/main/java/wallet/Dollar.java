package wallet;

/**
 * Created by kamilkucharski on 06.01.15.
 */
public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiplication) {
        return Money.dollar(amount * multiplication);
    }
}
