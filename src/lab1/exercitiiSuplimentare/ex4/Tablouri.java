package lab1.exercitiiSuplimentare.ex4;

public class Tablouri {

    /**
     * Functia asta construieste o matrice folosind formula metoda asta m[i][j] = a[i] * b[j],
     * @param a un array, il putem identifica si ca un vector
     * @param b un array, il putem identifica si ca un vector
     */
    public static double[][] calculeazaMatriceaM(double[] a, double[] b) {
        int n = a.length;
        int m = b.length;
        double[][] matriceM = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriceM[i][j] = a[i] * b[j];
            }
        }

        return matriceM;
    }

    /**
     * Functia asta construieste un vector cu cele mai mici valori ale altor 2 vectori,
     * comparatia intre valori se face in functie de pozitia pe care se afla, min(a[i], b[i]).
     * @param a un array, il putem identifica si ca un vector
     * @param b un array, il putem identifica si ca un vector
     */
    public static double[] calculeazaVectorulV(double[] a, double[] b) {
        int n = a.length;
        double[] vectorV = new double[n];

        for (int i = 0; i < n; i++) {
            vectorV[i] = Math.min(a[i], b[i]);
        }

        return vectorV;
    }

    /**
     * Functia asta are scop afisearea vectorului construit de functia calculeazaMatriceaM
     * @param matrice
     */
    public static void afiseazaMatrice(double[][] matrice) {
        for (double[] linie : matrice) {
            for (double element : linie) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    /**
     * Functia asta are scop afisearea vectorului construit de functia calculeazaVectorulV
     * @param vector
     */
    public static void afiseazaVector(double[] vector) {
        for (double element : vector) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initializam doua tablouri constante de numere reale
        double[] a = {1.5, 2.5, 3.5};
        double[] b = {4.0, 5.0, 6.0};

        /**
        * 1. Calculam valoarea matricii folosind methoda calculeazaMatriceaM, care are 2 parametri.
        * 2. Printam matricea folosind functia afiseazaMatriceaM,
        *    care primeste ca parametru unic valoarea stocata in variabila matriceM
        */
        double[][] matriceM = calculeazaMatriceaM(a, b);
        System.out.println("Matricea M:");
        afiseazaMatrice(matriceM);

        /**
         * 1. Calculam valoarea vectorului folosind methoda calculeazaVectorulV, care are 2 parametri.
         * 2. Printam vectorul folosind functia afiseazaVector,
         *    care primeste ca parametru unic valoarea stocata in variabila vectorV
         */
        double[] vectorV = calculeazaVectorulV(a, b);
        System.out.println("Vectorul V:");
        afiseazaVector(vectorV);
    }
}

