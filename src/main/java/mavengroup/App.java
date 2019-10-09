package mavengroup;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] shiftList = {1,2,3,4,5};
        int[] myList = new int[5];

        java.util.Scanner input = new  java.util.Scanner(System.in);
//        create array myList with manual input
//        System.out.print( "Enter "  + myList.length + " values: " ); for (int i = 0 ; i < myList.length; i++)   myList[i] = input.nextInt();

        System.out.println("Array : " + Arrays.toString(shiftList));
        System.out.println("Max element : " + ArrayOperation.maxInArray(shiftList));
        System.out.println("Max element's index : " + ArrayOperation.maxIndexInArray(shiftList));
        System.out.println("Index of given object: " + ArrayOperation.indexOfObject(shiftList,2));

        System.out.println("Shuffled array: " +  Arrays.toString(ArrayOperation.shuffleArray(shiftList)));
        System.out.println("Average value in array : " + ArrayOperation.averageInArray(shiftList));
        System.out.println("Above average elements in array : " + ArrayOperation.aboveAverageInArray(shiftList));

        System.out.println("Shift Array by -1 " + Arrays.toString(ArrayOperation.shiftArrayByOne(shiftList)));
        System.out.println("Shift Array by -2 " + Arrays.toString(ArrayOperation.shiftArrayByTwo(shiftList)));
        System.out.println("Shift Array by x " + Arrays.toString(ArrayOperation.shiftArrayByX(shiftList, 4)));

        System.out.println("Reverse Array " + Arrays.toString(ArrayOperation.reverseArray(shiftList)));

        System.out.println("Sort Ascending before Binary Search " + Arrays.toString(ArrayOperation.sortAscendingArray(shiftList)));
        System.out.println("Binary Search for index of " + ArrayOperation.binarySearchInArray(shiftList, 4));




        double[][] matrix =new double[10][2];
//        double[][] testMatrix = new double[8][2];
        double[][] testMatrix = {{-1,3},{-1,-1},{1,1},{2,0.5},{2,-1},{3,3},{4,2},{4,-0.5}};
        MatrixArrayOperation.arrMatrix();
        System.out.println(Arrays.deepToString(MatrixArrayOperation.makeRandomArray(matrix)));
        MatrixArrayOperation.printArray(testMatrix);
        MatrixArrayOperation.findNearestPoints(testMatrix);


    }

}
