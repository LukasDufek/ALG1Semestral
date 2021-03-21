package _9_lukduf_SemestralProject;

import java.util.Scanner;

/**
 * The program sorts the points according to the distance from the line entered
 * by the user.
 *
 * @author Lukáš Dufek 30/12/2020
 */
public class SemestralniPrace {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char answer;
        int Ax = 0;
        int Ay = 0;
        int Bx = 0;
        int By = 0;
        int pocet = 0;

        double[][] arr;

        boolean end = false;

        do {
            System.out.println("Zadej body primky: ");
            Ax = sc.nextInt();
            Ay = sc.nextInt();

            Bx = sc.nextInt();
            By = sc.nextInt();

            //normal vector to perpendicular vector 
            double a = By - Ay;          //Uy vector
            double b = (-1) * (Bx - Ax); //Ux vector

            //general formula for calculating the distance of a point from a line
            double c = (-1) * ((a * Ax) + (b * Ay));

            System.out.println("Zadej pocet bodu: ");
            pocet = sc.nextInt();

            //arr = new double[pocet][3];
            System.out.println("Zadej souradnice bodu: ");

            arr = readValues(pocet);

            arr = distances(arr, a, b, c);

            bubbleSort(arr);

            System.out.println("Setridene body: ");
            printArray(arr);

            System.out.println("Pokracovat ve zpracovani? (a/n)");
            answer = sc.next().charAt(0);
            if (answer == 'n' || answer == 'N') {
                end = true;
            }

        } while (!end);

    }

    /**
     * reads individual points (x, y) and load them to array
     *
     * @param arr
     * @param pocet
     * @return array
     */
    public static double[][] readValues(int pocet) {
        
        double[][] arr = new double[pocet][3];
        
        int n= sc.nextInt();

        for (int i = 0; i < pocet; i++) {
            for (int j = 0; j < 2; j++) {
             arr[i][j]=sc.nextDouble(); 
    
            
            }
            
        }

        return arr;
    }

    /**
     * calculating the distances of points from a line distances load in the 3rd
     * column of array
     *
     * @param arr
     * @param a
     * @param b
     * @param c
     * @return array
     */
    public static double[][] distances(double[][] arr, double a, double b, double c) {
        double d;

        for (int i = 0; i < arr.length; i++) {
            d = (a * (arr[i][0]) + b * (arr[i][1]) + c);

            arr[i][2] = ( (Math.abs(d) ) / (Math.sqrt((a * a) + (b * b))));

        }

        return arr;
    }

    /**
     * sorting the points in ascending order by distance from the line
     *
     * @param arr
     */
    public static void bubbleSort(double[][] arr) {

        double[] tmp;
        double temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j][2] > arr[j + 1][2]) {

                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
 
                    
                }
            }

        }
        //return arr;
    }

    /**
     * print final array without 3rd column - distances
     *
     * @param a
     */
    public static void printArray(double[][] a) {
        for (int i = 0; i < a.length; i++) {

            /*
            for (int j = 0; j < (a[i].length)-1; j++) {
                //System.out.format("%-4.2f ", a[i][j]);
            } 
             */
            System.out.print(String.format("%5s %5s", a[i][0], a[i][1]));
            System.out.println("");
        }

    }

}
