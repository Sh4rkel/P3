package lab1.exercitiiSuplimentare.ex2;

public class Palindrom {

    /**
     * Metoda care verifica daca un numar este palindrom
     * @param number
     * @return True daca e palindrom, altfel retuneaza False
     */
    public static boolean isPalindrome(int number) {
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