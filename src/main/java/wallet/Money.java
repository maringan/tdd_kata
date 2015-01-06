package wallet;

/**
 * Created by kamilkucharski on 06.01.15.
 */
public class Money {
    protected int amount;

    public Money(int amount){
        this.amount = amount;
    }

    public Money times(int multiplication) {
        return new Money(this.amount * multiplication);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;

        Money money = (Money) o;

        if (amount != money.amount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
