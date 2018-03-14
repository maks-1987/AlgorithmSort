package ProcedurJava.LoopAndRecursion.Sort;

import ProcedurJava.LoopAndRecursion.Sort.BubbleSort;

import java.util.Arrays;

class BubbleSortTest {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {2, 1},
                {4, 6, 2},
                {0, 3, 2, 1},
                {6, 8, 3, 100, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + "-> ");
            BubbleSort.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}/*
[]-> []
[1]-> [1]
[2, 1]-> [1, 2]
[4, 6, 2]-> [2, 4, 6]
[0, 3, 2, 1]-> [0, 1, 2, 3]
[6, 8, 3, 100, 5, 4, 1, 2, 0, 9, 7]-> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100]
*/