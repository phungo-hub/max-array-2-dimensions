public class Main {
    public static void main(String[] args) {
        double[][] matrix = {
                {0, 983, 787, 714, 1375, 967, 1087},
                {983, 0, 214, 1102, 1763, 1723, 1842},
                {787, 214, 0, 888, 1549, 1548, 1627},
                {714, 1102, 888, 0, 661, 781, 810},
                {1375, 1763, 1549, 661, 0, 1426, 1187},
        };

        double max = 0;

        for (int row = 0; row < matrix.length; row ++) {
            for (int column = 0; column < matrix[0].length; column++) {
                if (matrix[row][column] > max) {
                    max = matrix[row][column];
                }
            }
        }
        System.out.print("Max của array: " + max);
    }
}