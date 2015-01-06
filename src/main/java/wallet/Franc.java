package wallet;


public class Franc extends Money{
    public Franc(int amount) {
        super(amount);
    }

    @Override
    public Money times(int multiplication) {
        return new Franc(amount * multiplication);
    }
}
