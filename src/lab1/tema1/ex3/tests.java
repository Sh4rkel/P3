package lab1.tema1.ex3;

public class tests {
    public static void testGetContourSize() {
        int[][] imag1 = {
                {100, 100, 100, 100},
                {100, 150, 100, 100},
                {100, 100, 200, 100},
                {100, 100, 100, 100}
        };
        System.out.println(ConturImagine.getDimensiuneContur(imag1)); // 1

        int[][] imag2 = {
                {255, 255, 255},
                {255, 0, 255},
                {255, 255, 255}
        };
        System.out.println(ConturImagine.getDimensiuneContur(imag2)); // 1

        int[][] imag3 = {
                {200, 200, 200},
                {200, 200, 200},
                {200, 200, 200}
        };
        System.out.println(ConturImagine.getDimensiuneContur(imag3)); // 1

        int[][] imag4 = {
                {100, 200},
                {200, 100}
        };
        System.out.println(ConturImagine.getDimensiuneContur(imag4)); // 0

        int[][] imag5 = {
                {50, 50, 50},
                {50, 50, 50},
                {50, 50, 50}
        };
        System.out.println(ConturImagine.getDimensiuneContur(imag5)); // 1
    }

}
