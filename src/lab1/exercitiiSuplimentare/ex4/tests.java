package lab1.exercitiiSuplimentare.ex4;

import org.junit.Test;
import static org.junit.Assert.*;

public class tests {

    @Test
    public void testCalculeazaMatriceaM() {
        double[] a = {1.5, 2.5, 3.5};
        double[] b = {4.0, 5.0, 6.0};
        double[][] expectedM = {
                {6.0, 7.5, 9.0},
                {10.0, 12.5, 15.0},
                {14.0, 17.5, 21.0}
        };

        // Verificam daca matricea calculata este corecta
        assertArrayEquals(expectedM, Tablouri.calculeazaMatriceaM(a, b));
    }

    @Test
    public void testCalculeazaVectorulV() {
        double[] a = {1.5, 2.5, 3.5};
        double[] b = {4.0, 5.0, 2.0};
        double[] expectedV = {1.5, 2.5, 2.0};

        // Verificam dacă vectorul calculat este corect
        assertArrayEquals(expectedV, Tablouri.calculeazaVectorulV(a, b), 0.0001);
    }

    @Test
    public void testMatriceaMForNegativeValues() {
        double[] a = {-1.5, -2.5, -3.5};
        double[] b = {4.0, -5.0, 6.0};
        double[][] expectedM = {
                {-6.0, 7.5, -9.0},
                {-10.0, 12.5, -15.0},
                {-14.0, 17.5, -21.0}
        };

        // Verificam daca matricea calculata este corecta pentru valori negative
        assertArrayEquals(expectedM, Tablouri.calculeazaMatriceaM(a, b));
    }

    @Test
    public void testVectorulVForNegativeValues() {
        double[] a = {-1.5, 2.5, -3.5};
        double[] b = {4.0, -5.0, -2.0};
        double[] expectedV = {-1.5, -5.0, -3.5};

        // Verificam daca vectorul calculat este corect pentru valori negative
        assertArrayEquals(expectedV, Tablouri.calculeazaVectorulV(a, b), 0.0001);
    }
}

