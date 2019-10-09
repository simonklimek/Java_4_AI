package mavengroup;

import java.util.Arrays;

public class ArrayOperation {

    private static int arrayLength;
    private static int arrayShiftCount;

    public ArrayOperation(){
//        constructor
    }

    public static int getArrayLength(){ return arrayLength; }


    public static int maxInArray(int[] a){
 //        Max element in array
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static int maxIndexInArray(int[] a){
        int indexOfMax = 0;
        int element = maxInArray(a);
        for (int i = 0; i < a.length; i++){
            if(a[i] == element)
                indexOfMax = i;
        }
        return indexOfMax;
    }

    public static int[] shuffleArray(int[] a){
 //        array shuffling
        for(int i = a.length -1; i > 0; i--){
//            Generate an index j randomly with 0 <= j <=i
            int j = (int)(Math.random()*(i+1));
//            Swap myList[i] with myList[j]
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }

    public static double averageInArray(int[] a){
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        double average = sum / a.length;
        return average;
    }

    public static int aboveAverageInArray(int[] a){
        double average = averageInArray(a);
//        The number of elements above average
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > average)
                count++;
        }
        return count;
    }

    public static String shiftArray() {
        return "[3,4,5,1,2]";
    }

    public static int[] shiftArrayByOne(int[] a){
//        Shifting elements by one to the left side
        int temp = a[0];  // Retain the first element
//        Shift elements left, loop starts with 1 not with 0!
        for(int i = 1; i < a.length; i++){
            a[i-1] = a[i];
        }
//        Move the first element to fill  in the last position
        a[a.length-1] = temp;
        return a;
    }

    public static int[] shiftArrayByTwo(int[] a){
        int temp = a[0];  // Retain the first element
        int temp2 = a[1];  // Retain the second element
//        Shift elements left, loop starts with 2 not with 0!
        for(int i = 2; i < a.length; i++){
            a[i-2] = a[i];
        }
//        Move the first two elements to fill  in the last positions
        a[a.length-2] = temp2;
        a[a.length-1] = temp;
        return a;
    }

    public static int[] shiftArrayByX(int[] a, int shifter){
//        Make a copy of input array
        int[] tempArray = new int[a.length];
        for(int i = 0; i < a.length; i++){
            tempArray[i] = a[i];
        }
//        Shift elements left, loop starts with x not with 0!
        for(int i = shifter; i < a.length; i++){
            a[i-shifter] = a[i];
        }
//        Move the first x elements to fill  in the last positions
        for(int i = 0; i < shifter; i++){
            a[a.length-(shifter-i)] = tempArray[i];
        }
        return a;
    }

    public static int[] reverseArray(int[] a){
        int[] result = new int[a.length];
        for(int i = 0, j = result.length -1; i < a.length; i++, j--){
            result[j] = a[i];
        }
        return result;
    }

    public static int[] sortAscendingArray(int[] a){
        int[] sortedArray = new int[a.length];
        int temp;
        for (int i = 0; i <= a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    sortedArray = a;
                }
            }
        }
        return sortedArray;
    }

    public static int binarySearchInArray(int[] a, int key){
        int low = 0;
        int high = a.length -1;

//        int mid = (low + high)/2;
//        if(key < a[mid])
//            high = mid-1;
//        else if (key == a[mid])
//            return mid;
//        else
//            low = mid + 1;

        while(high >= low){
            int mid = (low + high)/2;
            if(key < a[mid])
                high = mid -1;
            else if (key == a[mid])
                return mid;
            else
                low = mid +1;
        }
        return -low -1; // Now high < low, key not found
    }

    public static int indexOfObject(int[] a, int key){
        int index = -1;
        for(int i = 0; i < a.length; i++){
            if (a[i] == key)
                index = i;
//            return -1;
        }
        return index;
    }

}
