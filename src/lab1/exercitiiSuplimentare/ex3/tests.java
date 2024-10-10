package lab1.exercitiiSuplimentare.ex3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class tests {

    @Test
    public void testFibonacciForN5() {
        // Capturam output-ul
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Apelam metoda pentru n = 5
        sirulLuiFibonacci.printFibonacci(5);

        // Verificam output-ul
        String expectedOutput = "1 1 2 3 5\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testFibonacciForN1() {
        // Capturam output-ul
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Apelam metoda pentru n = 1
        sirulLuiFibonacci.printFibonacci(1);

        // Verificam output-ul
        String expectedOutput = "1\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testFibonacciForN0() {
        // Capturam output-ul
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Apelam metoda pentru n = 0
        sirulLuiFibonacci.printFibonacci(0);

        // Verificam output-ul
        String expectedOutput = "Introduceti un numar mai mare decat 0.\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testFibonacciForNegativeN() {
        // Capturam output-ul
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Apelam metoda pentru n negativ
        sirulLuiFibonacci.printFibonacci(-3);

        // Verificam output-ul
        String expectedOutput = "Introduceti un numar mai mare decat 0.\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testFibonacciForN2() {
        // Capturam output-ul
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Apelam metoda pentru n = 2
        sirulLuiFibonacci.printFibonacci(2);

        // Verificam output-ul
        String expectedOutput = "1 1\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}
