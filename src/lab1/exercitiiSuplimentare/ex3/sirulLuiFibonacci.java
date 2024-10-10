package lab1.exercitiiSuplimentare.ex3;

public class sirulLuiFibonacci {
    /**
     * Metoda pentru a calcula si afisa primii n termeni din sirul Fibonacci
     * @param n
     */
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Introduceti un numar mai mare decat 0.");
            return;
        }

        // Daca n este 1, afisam doar primul termen
        if (n == 1) {
            System.out.println("1");
            return;
        }

        // Initializam primii doi termeni din sir
        int a0 = 1, a1 = 1;

        // Afisam primii doi termeni
        System.out.print(a0 + " " + a1);

        // Calculam si afisam urmatorii termeni din sirul Fibonacci
        for (int i = 2; i < n; i++) {
            int an = a0 + a1;
            System.out.print(" " + an);
            a0 = a1;  // Mutam a1 la a0
            a1 = an;  // an devine noul a1
        }

        System.out.println(); // Linie noua la final
    }
}
