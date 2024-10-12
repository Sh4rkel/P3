package lab1.exercitiiSuplimentare.ex2;

/**
 * <h1>Palindrom</h1>
 * <p>Ca un numar sa fie palindrom trebuie ca numarul sa fie la fel ca si inversul acestuia</p>
 * @author Daniel Filip
 */

// Urmatoarea versiune este actualizata, am lasat la final si prima versiune

public class Palindrom {

    /**
     * Metoda care verifica daca un numar este palindrom
     * @param number
     * @return True daca e palindrom, altfel retuneaza False
     */
    public static boolean isPalindrom(int number) {
        /**
         * Convertim numarul intr-un sir de caractere,
         * dar mai intai ne asiguram ca este positiv, deoarece un numar negativ are si "-"
         */
        String str = Integer.toString(Math.abs(number));
        int len = str.length();

        // Verificam daca sirul este acelasi de la inceput la sfarsit si invers
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false; // Daca gasim o diferenta, nu este palindrom
            }
        }

        return true; // Daca nu am gasit diferente, este palindrom
    }
}

/**
 *  !!! Aceasta varianta nu a fost buna, deaorece nu putem stii cate cifre are numarul introdus,
 *  dar mai este si o problema de spatiu si timp in rularea acestui algoritm destul de basic pentru palindrom !!!
 * @param numar
 *
 * public static boolean isPalindrom(int numar) {
 *     int copieNumarIntial = numar;
 *     int invers = 0;
 *     while (copieNumarInitial > 0) {
 *         invers *= 10 + copieNumarInital % 10;
 *         copieNumarInitial /= 10;
 *     }
 *     return (numar == invers)
 * }
 */