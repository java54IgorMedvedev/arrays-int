package telran.util;

import java.util.Arrays;

public class ArraysInt {
    public static int[] addNumber(int[] array, int number) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = number;
        return newArray;
    }
    public static int[] insertNumber(int[] array, int index, int number) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = number;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }
    public static int[] removeNumber(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }
    public static int[] insertSorted(int[] sortedArray, int number) {
        int insertIndex = Arrays.binarySearch(sortedArray, number);
        if (insertIndex < 0) {
            insertIndex = -insertIndex - 1; 
        }
        return insertNumber(sortedArray, insertIndex, number);
    }
}
