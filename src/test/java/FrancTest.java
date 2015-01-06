import org.junit.Test;
import wallet.Franc;

import static org.junit.Assert.*;


public class FrancTest {
    @Test
    public void testMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(10)));
    }
}