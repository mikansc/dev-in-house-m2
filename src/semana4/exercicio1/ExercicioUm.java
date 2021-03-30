package semana4.exercicio1;

public class ExercicioUm {

    public static void main(String[] args) {

        final int ARRAY_SIZE = 3;
        int counter = 0;

        int[][] array = new int[ARRAY_SIZE][ARRAY_SIZE];

        for (int x = 0; x < ARRAY_SIZE; x++) {
            for (int y = 0; y < ARRAY_SIZE; y++) {
                array[x][y] = x + y;
                counter++;
            }
        }

        System.out.printf("O array contem %d elementos.%n", counter);

    }
}
