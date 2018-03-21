package ProcedurJava.Sort;
/**
 * Сильные стороны быстой сортировки: она использует небольшой вспомогательный
 * стек. и упорядочивает массив длиной N в среднем за время, пропорциональное
 * NlgN. У нее более короткий внутренний цикл в сравнении с др. алгоритмами.
 * Основной недостаток - излишняя чувствительность: возможно снижение
 * производительности. Использует метод "разделяй и властвуй". Разбивает массив
 * на 2 подмасива, с последующей независимой сортировкой подмассивов.
 * Позиция разбиения зависит от содержимого массива. 
 */
import java.util.Arrays;

class QuickSort_2 {
    static void quickSort(int[] array, int low, int high) {
        // завершить выполнение, если длина массива = 0
        if (array.length == 0) return;
        // заверш выполнен, если уже нечего делить
        if (low >= high) return;

        // выбрать опорный элемент
        int mid = low + (high - low)/2;
        int opora = array[mid];

        // разделить на подмассивы, которые больше и меньше опорнргр элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) { // меняем местами
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] x = {8,0,4,7,3,7,10,12,-3};
        System.out.println("Было " + Arrays.toString(x));
        int low = 0;
        int high = x.length-1;
        quickSort(x, low, high);

        System.out.print("Стало " +Arrays.toString(x));
    }
}
