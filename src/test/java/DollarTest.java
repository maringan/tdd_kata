import org.junit.Test;
import wallet.Dollar;
import wallet.Franc;
import wallet.Money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class DollarTest {
    @Test
    public void testMultiplication(){
        Dollar five = (Dollar) Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertFalse(new Dollar(5).equals(new Franc(5)));
    }
}
