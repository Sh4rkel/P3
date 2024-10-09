package lab1.tema1.ex3;

public class tests {
    public static void testGetContourSize() {
        int[][] image1 = {
                {100, 100, 100, 100},
                {100, 150, 100, 100},
                {100, 100, 200, 100},
                {100, 100, 100, 100}
        };
        System.out.println(ConturImagine.getDimensiuneContur(image1)); // Ar trebui sa fie 1

        int[][] image2 = {
                {255, 255, 255},
                {255, 0, 255},
                {255, 255, 255}
        };
        System.out.println(ConturImagine.getDimensiuneContur(image2)); // Ar trebui sa fie 1

        int[][] image3 = {
                {200, 200, 200},
                {200, 200, 200},
                {200, 200, 200}
        };
        System.out.println(ConturImagine.getDimensiuneContur(image3)); // Ar trebui sa fie 1

        int[][] image4 = {
                {100, 200},
                {200, 100}
        };
        System.out.println(ConturImagine.getDimensiuneContur(image4)); // Ar trebui sa fie 0

        int[][] image5 = {
                {50, 50, 50},
                {50, 50, 50},
                {50, 50, 50}
        };
        System.out.println(ConturImagine.getDimensiuneContur(image5)); // Ar trebui sa fie 1
    }

}
