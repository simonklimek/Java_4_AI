package mavengroup;

import java.util.Arrays;

public class MatrixArrayOperation {

    public MatrixArrayOperation(){
//        Constructor
    }

    public static void arrMatrix() {
        int[][] matrix = new int[5][5];
        matrix[2][1] = 7;
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrix[0].length);
    }

    public static double[][] makeRandomArray(double[][] matrix){
        for(int row = 0 ; row < matrix.length; row++) {
            for(int column = 0 ; column < matrix[row].length; column++) {
                matrix[row][column] = ( int )(Math.random() * 100 );   } }
        return matrix;
    }

    public static void printArray(double[][] matrix){
        for(int row = 0 ; row < matrix.length; row++) {
            for(int column = 0 ; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " " );   }
            System.out.println(); }
    }

    public static void findNearestPoints(double[][] points){
        int p1 = 0, p2 = 1;
//        p1 and p2 are the indices in the points array
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

//        compute distance for every two points
        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]); // Find the distance
            if(shortestDistance > distance){
                p1 = i; // update p1
                p2 = j; // update p2
                shortestDistance = distance; // update shortest distance
            }
            }
        }
        // Display result
        System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
    }

    //        compute the distance between two points (x1,y1) and (x2,y2)
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }


}
