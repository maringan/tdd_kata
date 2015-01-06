package wallet;

/**
 * Created by kamilkucharski on 06.01.15.
 */
public class Franc {
    private int amount = 10;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplication) {
        return new Franc(this.amount * multiplication);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Franc)) return false;

        Franc dollar = (Franc) o;

        if (amount != dollar.amount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
