package wallet;


abstract public class Money {
    protected int amount;
    private String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
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
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    public String currency(){
        return currency;
    }
}
