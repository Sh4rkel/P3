package lab1.tema1.ex2;

/**
 * @author Daniel Filip
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class tests {

    @Test
    public void testEliminareaDuplicatelor() {
        /**
         * Test 1: Testam cazul dat
         */
        String input1 = "abba...metttallica";
        String expected1 = "aba.metalica";
        assertEquals(expected1, Duplicate.eliminaDuplicatele(input1));

        /**
         * Test 2: Testam un sir cu caractere repetitive
         */
        String input2 = "hello world";
        String expected2 = "helo world";
        assertEquals(expected2, Duplicate.eliminaDuplicatele(input2));

        /**
         * Test 3: Testam un sir cu toate caracterele identice
         */
        String input3 = "aaaaaa";
        String expected3 = "a";
        assertEquals(expected3, Duplicate.eliminaDuplicatele(input3));

        /**
         * Test 4: Testam un sir gol
         */
        String input4 = "";
        String expected4 = "";
        assertEquals(expected4, Duplicate.eliminaDuplicatele(input4));

        /**
         * Test 5: Testam un sir fara duplicate
         */
        String input5 = "abcdef";
        String expected5 = "abcdef";
        assertEquals(expected5, Duplicate.eliminaDuplicatele(input5));
    }
}

