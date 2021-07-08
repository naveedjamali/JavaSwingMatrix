import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * Task B
 */
public class Matrix {

    /**
     * Task B-1: write a method named genMatrix...
     *
     * @param m
     * @return double[][]
     */
    public static double[][] genMatrix(int m) {
        double M[][] = new double[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                Random r = new Random();
                double randomValue = 0 + (100 - 0) * r.nextDouble();

                M[i][j] = randomValue;
            }
        }
        return M;
    }

    /**
     * Task B-2: print matrix
     */

    public static String printMatrix(double[][] m) {
        String matrix = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                matrix += new DecimalFormat("00.00").format(m[i][j]) + "    ";
            }
            matrix += "\n";
        }

        return matrix;


    }

    /**
     * Task B-3:
     */

    public static String isSymmetric(double[][] m) {
        boolean isSym = true;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != m[j][i]) {
                    isSym = false;
                    break;
                }
            }

        }
        return isSym ? "Matrix is Symmetric" : "Matrix is not symmetric";

    }


    /**
     * Task B-4: Multiply
     */

    public static double[][] multiply(double c, double[][] m) {
        double[][] m1 = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m1[i][j] = m[i][j] * c;
            }

        }
        return m1;
    }


    /**
     * Task B-5: Square
     */
    public static double[][] square(double[][] m1) {

        double[][] m2 = new double[m1[0].length][m1.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m2[i][j] = m1[i][j] * m1[j][i];
            }
        }


        return m2;
    }


    /**
     * Task B-6: main method
     */
    public static void main(String[] args) {

        double[][] m = null;
        int c = 0;
        do {
            c = Integer.parseInt(JOptionPane.showInputDialog(null, "M is a matrix with random positive values less than 100" +
                    "\nchoose one of the following to resume the program" +
                    "\n\n" +
                    "1: Create M\n" +
                    "2: Display M\n" +
                    "3: Square M\n" +
                    "4: Multiply M with a coefficient\n" +
                    "5: Check whether M is symmetric\n" +
                    "6: Quit the program\n\n"));

            switch (c) {

                case 1:
                    int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer as matrix dimension\n"));
                    m = new double[a][a];
                    m = genMatrix(a);

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, m == null ? "Invalid options: There is no matrix to show\nCreate a matrix first" :"The random generated matrix" +
                            " of size "+m.length+" by "+m[0].length+" is\n\n"+ printMatrix(m));

                    break;
                case 3:
                    if (m == null)
                        JOptionPane.showInputDialog(null, "Invalid options: There is no matrix to square\nCreate a matrix first");
                    m = square(m);
                    break;
                case 4:
                    int co = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer as Coefficient\n"));
                    m = multiply(co, m);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, isSymmetric(m));
                    break;
                case 6:

                    break;

            }

        } while (c != 6);

    }

}
