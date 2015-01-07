package wallet;


public class Franc extends Money{
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiplication) {
        return Money.franc(amount * multiplication);
    }
}
