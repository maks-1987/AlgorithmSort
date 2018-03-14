package ProcedurJava.LoopAndRecursion;

import java.util.Arrays;

/**
 * Замена порядка массива на обратный. Есть вариант с использованием
 * дополнительного массива, в который копируются значения первого, есть
 * 2-й вариант - работать внутри массива без создания других массивов.
 * Здесь используются две ИДИОМЫ: делим массив по середине и меняем значения
 * индексов мествми (реализовано в условии for); вторая - (в теле цикла)
 * обмен значениями элементов.
 */
class ArrayInverter {
    public static void main(String[] args) {
        int[] arr = {8, 4, -9, 0, 7};
        System.out.println(Arrays.toString(arr));
        // 1 - замена порядка индексов массива
        for (int k = 0; k < arr.length / 2; k++) {
            // 2 - обмен значениями элементов
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}/*
    [8, 4, -9, 0, 7]
    [7, 0, -9, 4, 8]
 */
