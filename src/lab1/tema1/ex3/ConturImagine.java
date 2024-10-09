package lab1.tema1.ex3;

public class ConturImagine {
    /**
     *
     * @param image
     * @return
     */
    public static int getDimensiuneContur(int[][] image) {
        /**
         * Verificam daca matricea este goala
         */
        if (image.length == 0 || image[0].length == 0) {
            return 0;
        }

        int rows = image.length;
        int cols = image[0].length;

        /**
         * Nuantele din primele si ultimele randuri
         */
        int firstRowValue = image[0][0];
        int lastRowValue = image[rows - 1][0];

        /**
         * Nuantele din primele si ultimele coloane
         */
        int firstColValue = image[0][0];
        int lastColValue = image[0][cols - 1];

        /**
         *  Verificam dacă prima si ultima linie sunt identice
         */
        boolean firstRowSame = true;
        for (int j = 0; j < cols; j++) {
            if (image[0][j] != firstRowValue || image[rows - 1][j] != lastRowValue) {
                firstRowSame = false;
                break;
            }
        }

        /**
         * Verificam daca prima si ultima coloana sunt identice
         */
        boolean firstColSame = true;
        for (int i = 0; i < rows; i++) {
            if (image[i][0] != firstColValue || image[i][cols - 1] != lastColValue) {
                firstColSame = false;
                break;
            }
        }

        /**
         * Verificam conturul
         */
        if (firstRowSame && firstColSame) {
            /**
             * Conturul este definit de nuantele din prima linie si prima coloana
             */
            return firstRowValue == firstColValue ? 1 : 0;
        } else if (firstRowSame) {
            return firstRowValue == lastColValue ? 1 : 0;
        } else if (firstColSame) {
            return firstColValue == lastRowValue ? 1 : 0;
        }
        /**
         * Nu avem contur
         */
        return 0;
    }
}
