import javax.swing.*;

public class Arrays {
    public static void main(String[] args){

        /**
         * Task a: Write two overload methods.
         */
        JOptionPane.showMessageDialog(null, "Enter 5 double numbers to calcuate average.");
        double[] doubleArray = new double[5];
        for(int i=0;i<5;i++){
            double num = Double.parseDouble( JOptionPane.showInputDialog(null,"Please enter number  "+(i+1)));
            doubleArray[i] = num;
        }
        JOptionPane.showMessageDialog(null, "Average of double numbers is: "+average(doubleArray));


    }

    /**
     * (a) write two overloaded methods that return an average of an array with the following headers.
     * @param array
     * @return
     */
    public static int average(int[] array){
        int sum = 0;
                for(int i=0;i<array.length;i++){
                    sum+=array[i];
                }
                return sum/array.length;
    }


    public static double average(double[] array){
        double sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length
                ;
    }


}
