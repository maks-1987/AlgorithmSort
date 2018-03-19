package ProcedurJava.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Бинарный поиск рекурсивный.
 */
class BinarySearchRecurs {
    static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) { // left=0, right=9-1=8
                             // (left=5, right=8)
            int mid = left + (right - left) / 2; // mid=4(середина массива)
                                             // (mid=6)
            if (arr[mid] == x) // arr[mid]=77 - элемент под индексом 4=77
                return mid;    // (=108)
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);
            else
                return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        for (int i = 0; i<3; i++) { // позволяет трижды написать число "х"
            int[] arr = {-888, -9, 1, 3, 4, 10, 16, 23, 34, 42, 51, 77, 100, 108, 229, 999};
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Напишите искомое число 'x' от 0 - 1000");
            String x = br.readLine(); // x - искомое число в массиве
            int nx = Integer.parseInt(x);

            int result = binarySearch(arr, 0, arr.length - 1, nx);
            System.out.print(result == -1 ? result + " Not Found!\n" : "At index: " +result+ "\n");
        }
    }
}

