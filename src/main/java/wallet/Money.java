package wallet;


abstract public class Money {
    protected int amount;

    public Money(int amount){
        this.amount = amount;
    }

    abstract public Money times(int multiplication);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }
}
