package lab1.exercitiiSuplimentare.ex2;

import static org.junit.Assert.*;
import org.junit.Test;

public class tests {

    @Test
    public void testPositivePalindrome() {
        assertTrue(Palindrom.isPalindrom(121));    // Palindrom
        assertTrue(Palindrom.isPalindrom(12321));  // Palindrom
        assertTrue(Palindrom.isPalindrom(1));      // Palindrom (numerele cu o singura cifra)
        assertTrue(Palindrom.isPalindrom(0));      // Palindrom (cazul 0)
    }

    @Test
    public void testNegativePalindrome() {
        assertTrue(Palindrom.isPalindrom(-121));   // Palindrom (-121 citit invers e tot -121)
        assertTrue(Palindrom.isPalindrom(-12321)); // Palindrom (-12321)
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(Palindrom.isPalindrom(123));   // Nu este palindrom
        assertFalse(Palindrom.isPalindrom(100));   // Nu este palindrom
        assertFalse(Palindrom.isPalindrom(10));    // Nu este palindrom
    }
}

