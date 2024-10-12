package lab1.tema1.ex2;

/**
 * <h1>Eliminarea duplicatelor</h1>
 * @author Daniel Filip
 */

public class Duplicate {
    /**
     * Eliminam daor duplicatele, nu si aparitile multiple ale literelor,
     * spre exemplu pentru fraza Uniiiiversitatttea de Vest o sa avem
     * "Universitatea de Vest", nu "Universtat d"
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

    public static void main(String[] args) {
        // Exemple
        System.out.println(eliminaDuplicatele("abba...metttallica")); // "aba.metalica"
        System.out.println(eliminaDuplicatele("hello world")); // "helo wrd"
    }
}
