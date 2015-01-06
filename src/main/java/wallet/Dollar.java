package wallet;

/**
 * Created by kamilkucharski on 06.01.15.
 */
public class Dollar {
    private int amount = 10;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplication) {
        return new Dollar(this.amount * multiplication);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dollar)) return false;

        Dollar dollar = (Dollar) o;

        if (amount != dollar.amount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
