package lab1.exercitiiSuplimentare.ex1;

import org.junit.Test;
import static org.junit.Assert.*;

public class tests {

    @Test
    public void testFactorialValid() {
        assertEquals(1, Factorial.factorial(0)); // Test pentru n = 0
        assertEquals(1, Factorial.factorial(1)); // Test pentru n = 1
        assertEquals(2, Factorial.factorial(2)); // Test pentru n = 2
        assertEquals(6, Factorial.factorial(3)); // Test pentru n = 3
        assertEquals(24, Factorial.factorial(4)); // Test pentru n = 4
        assertEquals(120, Factorial.factorial(5)); // Test pentru n = 5
        assertEquals(479001600, Factorial.factorial(12)); // Test pentru n = 12
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialInvalidNegative() {
        // Testam cazul unui numar negativ, care ar trebui sa arunce o exceptie
        Factorial.factorial(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialInvalidTooLarge() {
        // Testam cazul unui numar mai mare decat 12, care ar trebui sa arunce o exceptie
        Factorial.factorial(13);
    }
}

