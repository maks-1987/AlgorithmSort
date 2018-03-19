package ProcedurJava.Sort;

import java.util.Arrays;

class MergeSort {
    private static void mergeSort(int[] a, int low, int high) {
        if (low + 1 < high) {
            int mid = (low + high) >>> 1; // low+(high-low)/2
            mergeSort(a, low, mid);
            mergeSort(a, mid, high);

            int size = high - low;
            int[] b = new int[size];
            int i = low;
            int j = mid;
            for (int k = 0; k < size; k++) {
                if (j >= high || i < mid && a[i] < a[j]) {
                    b[k] = a[i++];
                } else {
                    b[k] = a[j++];
                }
            }
            System.arraycopy(b, 0, a, low, size);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,23,3,54,12,2,55};
        mergeSort(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }
}
