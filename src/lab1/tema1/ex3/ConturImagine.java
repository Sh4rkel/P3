package lab1.tema1.ex3;

public class ConturImagine {
    /**
     *
     * @param image
     * @return 1 daca avem contur si 0 daca nu avem
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
        int valPrimulRand = image[0][0];
        int valUtimulRand = image[rows - 1][0];

        /**
         * Nuantele din primele si ultimele coloane
         */
        int valPrimaColoana = image[0][0];
        int valUltimaColoana = image[0][cols - 1];

        /**
         *  Verificam dacă prima si ultima linie sunt identice
         */
        boolean primulRand = true;
        for (int j = 0; j < cols; j++) {
            if (image[0][j] != valUtimulRand || image[rows - 1][j] != valUtimulRand) {
                primulRand = false;
                break;
            }
        }

        /**
         * Verificam daca prima si ultima coloana sunt identice
         */
        boolean primaColoana = true;
        for (int i = 0; i < rows; i++) {
            if (image[i][0] != valPrimaColoana || image[i][cols - 1] != valUltimaColoana) {
                primaColoana = false;
                break;
            }
        }

        /**
         * Verificam conturul
         */
        if (primulRand && primaColoana) {
            /**
             * Conturul este definit de nuantele din prima linie si prima coloana
             */
            return valUtimulRand == valPrimaColoana ? 1 : 0;
        } else if (primulRand) {
            return valPrimulRand == valUltimaColoana ? 1 : 0;
        } else if (primaColoana) {
            return valPrimaColoana == valUtimulRand ? 1 : 0;
        }
        /**
         * Nu avem contur
         */
        return 0;
    }
}
