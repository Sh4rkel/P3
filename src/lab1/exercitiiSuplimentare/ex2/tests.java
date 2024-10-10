package lab1.exercitiiSuplimentare.ex2;

import static org.junit.Assert.*;
import org.junit.Test;

public class tests {

    @Test
    public void testPositivePalindrome() {
        assertTrue(Palindrom.isPalindrome(121));    // Palindrom
        assertTrue(Palindrom.isPalindrome(12321));  // Palindrom
        assertTrue(Palindrom.isPalindrome(1));      // Palindrom (numerele cu o singura cifra)
        assertTrue(Palindrom.isPalindrome(0));      // Palindrom (cazul 0)
    }

    @Test
    public void testNegativePalindrome() {
        assertTrue(Palindrom.isPalindrome(-121));   // Palindrom (-121 citit invers e tot -121)
        assertTrue(Palindrom.isPalindrome(-12321)); // Palindrom (-12321)
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(Palindrom.isPalindrome(123));   // Nu este palindrom
        assertFalse(Palindrom.isPalindrome(100));   // Nu este palindrom
        assertFalse(Palindrom.isPalindrome(10));    // Nu este palindrom
    }
}

