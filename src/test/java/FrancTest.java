import org.junit.Test;
import wallet.Franc;
import wallet.Money;

import static org.junit.Assert.*;


public class FrancTest {
    @Test
    public void testMultiplication(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(10)));
    }
}
