package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


}
