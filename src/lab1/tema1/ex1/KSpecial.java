package lab1.tema1.ex1;

/**
 * @author Daniel Filip
 */

public class KSpecial {
    /**
     *
     * @param A: array-ul de biti
     * @param n: numarul de biti din array
     * @param k: de cate ori trebuie sa contina sirul nostru biti de 1
     * @return True daca countZerouri == k si False daca countZerouri != k
     */
    public static boolean KSpecial(int[] A, int n, int k) {
        /**
         * Verificam daca primul bit este 1
         */
        if (A[0] != 1) {
            return false;
        }
        /**
         * Numaram cati biti de 1 avem
         */
        int countZerouri = 0;
        /**
         * Numaram cati de 0 avem intre doi biti de 1 consecutivi
         */
        int zerouriIntre1 = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] == 1) {
                /**
                 * Am gasit un 1
                 */
                countZerouri++;

                /**
                 * Verificam daca exista mai mult de un zero intre doi biti de 1
                 */
                if (zerouriIntre1 > 1) {
                    return false;
                }
                /**
                 *  Resetăm numaratoarea de zerouri
                 */
                zerouriIntre1 = 0;
            } else if (A[i] == 0) {
                /**
                 * Am gasit un 0
                 */
                zerouriIntre1++;
            } else {
                /**
                 * Daca exista caractere care nu sunt 0 sau 1
                 */
                return false;
            }
        }

        /**
         * Verificam dacă am avut exact countOnes de 1
         */
        return countZerouri == k;
    }

    public static void main(String[] args) {
        // Test 1: Sirul 101100 este 3-special
        int[] A1 = {1, 0, 1, 1, 0, 0};
        int n1 = A1.length;
        System.out.println(KSpecial(A1, n1, 3)); // True

        // Test 2: Sirul 110010 nu este 3-special
        int[] A2 = {1, 1, 0, 0, 1, 0};
        int n2 = A2.length;
        System.out.println(KSpecial(A2, n2, 3)); // False

        // Test 3: Sirul 111 este 3-special
        int[] A3 = {1, 1, 1};
        int n3 = A3.length;
        System.out.println(KSpecial(A3, n3, 3)); // True

        // Test 4: Sirul 100 nu este 2-special
        int[] A4 = {1, 0, 0};
        int n4 = A4.length;
        System.out.println(KSpecial(A4, n4, 2)); // False
    }
}