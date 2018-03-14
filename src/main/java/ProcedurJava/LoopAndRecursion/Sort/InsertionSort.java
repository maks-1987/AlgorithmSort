package ProcedurJava.LoopAndRecursion.Sort;

/**
 * Сортировка вставками - есть массив, в котором через к-шагов будет
 * отрезано к-элементов, полученный промежуток будет отсортирован.
 * После продвижения границы получается новый массив, в нем нужно
 * проверять только один элемент - тот что получился после сдвига границы.
 * Этот элемент вставляем в массив на необходимое место.
 */
class InsertionSort {
    // int[] arr = {1, 3, 7, 2, 10, 6, 9}; - его сортируем
    static void sort(int[] arr) {
        // первая граница второй элем массива (к=1 индекс в массиве)
        // for задает границу массива, двигаясь на одну ячейку вправо
        for (int k = 1; k < arr.length; k++) {
            // копируем знач индекса массива во временную переменную
            int newElement = arr[k]; //arr[k]=3,7,2...-значение индекса 1,2...
            // newElement=3, location = 0(1 - 1)
            // newElement=7, location = 1(2 - 1)
            int location = k - 1;
            // arr[location]=1,3,7...
            while (location >= 0 && arr[location] > newElement) {
                // arr[location+1]=3,7,2...
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }
}
