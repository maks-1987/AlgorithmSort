package ProcedurJava.Sort;

import java.util.Arrays;

class InsertionSortTest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 10, 6, 9};
        System.out.println(Arrays.toString(arr));
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
