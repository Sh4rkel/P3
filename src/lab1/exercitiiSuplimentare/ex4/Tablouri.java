package lab1.exercitiiSuplimentare.ex4;

public class Tablouri {

    /**
     * Functia pentru a construi si afisa matricea m[i][j] = a[i] * b[j]
     * @param a
     * @param b
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

    // Functia pentru a construi si afisa vectorul v[i] = min{a[i], b[i]}
    public static double[] calculeazaVectorulV(double[] a, double[] b) {
        int n = a.length;
        double[] vectorV = new double[n];

        for (int i = 0; i < n; i++) {
            vectorV[i] = Math.min(a[i], b[i]);
        }

        return vectorV;
    }

    // Functia pentru afisarea unei matrice
    public static void afiseazaMatrice(double[][] matrice) {
        for (double[] linie : matrice) {
            for (double element : linie) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Functia pentru afișarea unui vector
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

        // Calculam si afisam matricea m
        double[][] matriceM = calculeazaMatriceaM(a, b);
        System.out.println("Matricea M:");
        afiseazaMatrice(matriceM);

        // Calculam si afisam vectorul v
        double[] vectorV = calculeazaVectorulV(a, b);
        System.out.println("Vectorul V:");
        afiseazaVector(vectorV);
    }
}

