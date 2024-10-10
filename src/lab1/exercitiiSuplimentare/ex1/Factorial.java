package lab1.exercitiiSuplimentare.ex1;

public class Factorial {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Verificam daca avem un argument pe linia de comanda
        if (args.length != 1) {
            System.out.println("Va rugam să introduceti un numar intre 0 si 12 ca argument.");
            return;
        }

        try {
            // Convertim argumentul intr-un numar intreg
            int n = Integer.parseInt(args[0]);

            // Verificam daca numarul este in intervalul valid [0, 12]
            if (n < 0 || n > 12) {
                System.out.println("Numarul trebuie sa fie între 0 și 12.");
            } else {
                // Calculam factorialul
                int result = factorial(n);
                System.out.println("Factorialul lui " + n + " este: " + result);
            }
        } catch (NumberFormatException e) {
            // Daca argumentul nu este un numar valid
            System.out.println("Va rugam sa introduceti un numar valid intre 0 și 12.");
        }
    }

    /**
     * Metoda care calculeaza factorialul unui numar
     * @param n
     * @return rezultatul factorialului
     */
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

