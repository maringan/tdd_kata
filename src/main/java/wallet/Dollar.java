package wallet;

/**
 * Created by kamilkucharski on 06.01.15.
 */
public class Dollar extends Money {
    public Dollar(int amount) {
        super(amount);
    }

    @Override
    public Money times(int multiplication) {
        return new Dollar(amount * multiplication);
    }
}
