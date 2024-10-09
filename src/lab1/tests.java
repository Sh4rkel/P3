package lab1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Daniel Filip
 */
public class tests {

    @Test
    public void testIsKSpecialTrue() {
        /**
         * Test 1: Șirul 101100 este 3-special
         */
        int[] A1 = {1, 0, 1, 1, 0, 0};
        int n1 = A1.length;
        assertTrue(temaEx1.KSpecial(A1, n1, 3));
    }

    @Test
    public void testIsKSpecialFalse() {
        /**
         * Test 2: Șirul 110010 nu este 3-special
         */
        int[] A2 = {1, 1, 0, 0, 1, 0};
        int n2 = A2.length;
        assertFalse(temaEx1.KSpecial(A2, n2, 3));
    }

    @Test
    public void testIsKSpecialEdgeCaseTrue() {
        /**
         * Test 3: Sirul 111 este 3-special
         */
        int[] A3 = {1, 1, 1};
        int n3 = A3.length;
        assertTrue(temaEx1.KSpecial(A3, n3, 3));
    }

    @Test
    public void testIsKSpecialEdgeCaseFalse() {
        /**
         * Test 4: Sirul 100 nu este 2-special
         */
        int[] A4 = {1, 0, 0};
        int n4 = A4.length;
        assertFalse(temaEx1.KSpecial(A4, n4, 2));
    }

    @Test
    public void testIsKSpecialShortTrue() {
        /**
         * Test 5: Sirul 101 este 2-special
         */
        int[] A5 = {1, 0, 1};
        int n5 = A5.length;
        assertTrue(temaEx1.KSpecial(A5, n5, 2));
    }

    @Test
    public void testIsKSpecialTooManyZeros() {
        /**
         * Test 6: Sirul 1001 are mai mult de 1 zero Intre doi de 1, deci nu e k-special
         */
        int[] A6 = {1, 0, 0, 1};
        int n6 = A6.length;
        assertFalse(temaEx1.KSpecial(A6, n6, 2));
    }
}

