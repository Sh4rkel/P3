package lab1.tema1.ex3;

public class ConturImagine {
    /**
     *
     * @param imag
     * @return 1 daca avem contur si 0 daca nu avem
     */
    public static int getDimensiuneContur(int[][] imag) {
        /**
         * Verificam daca matricea este goala
         */
        if (imag.length == 0 || imag[0].length == 0) {
            return 0;
        }

        int rows = imag.length;
        int cols = imag[0].length;

        /**
         * Nuantele din primele si ultimele randuri
         */
        int valPrimulRand = imag[0][0];
        int valUtimulRand = imag[rows - 1][0];

        /**
         * Culorile din primele si ultimele coloane
         */
        int valPrimaColoana = imag[0][0];
        int valUltimaColoana = imag[0][cols - 1];

        /**
         *  @param primulRand
         *  Verificam dacă prima si ultima linie sunt identice,
         *  daca nu sunt atunci modificam valaorea de adevar a variabilei primulRand din True in False si abandonam
         */
        boolean primulRand = true;
        for (int j = 0; j < cols; j++) {
            if (imag[0][j] != valUtimulRand || imag[rows - 1][j] != valUtimulRand) {
                primulRand = false;
                break;
            }
        }

        /**
         * Verificam daca prima si ultima coloana sunt identice
         */
        boolean primaColoana = true;
        for (int i = 0; i < rows; i++) {
            if (imag[i][0] != valPrimaColoana || imag[i][cols - 1] != valUltimaColoana) {
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
