package lab1.tema1.ex2;

/**
 * @author Daniel Filip
 */
public class Duplicate {
    /**
     *
     * @param input
     * @return result in format string
     */
    public static String eliminaDuplicatele(String input) {
        if (input == null || input.isEmpty()) {
            /**
             * Returneaza inputul original daca este null sau gol
             */
            return input;
        }

        StringBuilder result = new StringBuilder();
        /**
         * Adauga primul caracter în rezultat
         */
        result.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            /**
             * Adauga caracterul la rezultat doar daca este diferit de caracterul anterior
             */
            if (input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }
}
