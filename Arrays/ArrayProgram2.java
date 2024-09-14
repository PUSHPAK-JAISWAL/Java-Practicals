package Arrays;

import java.util.Arrays;

public class ArrayProgram2 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 89, 23, 56};

        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int key = 34;
        int index = Arrays.binarySearch(numbers, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}
