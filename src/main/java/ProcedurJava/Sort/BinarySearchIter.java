package ProcedurJava.Sort;

class BinarySearchIter {
    // поиск принимает массив и число для поиска
    static void search(int[] arr, int x) {
        int low = 0; // нижняя граница массива
        int high = arr.length-1; // верхняя гр массива
        int mid = (low + (high-low))/2; // (0+(7-0)/2)=3 - середина масс
        //arr[mid]-элемент массива под индексом 3 = 7 !!!
        while (arr[mid] != x & high != mid & low != mid) {
            if (arr[mid] < x) {
                low = (mid+1);
                mid = (low + (high-low)/2);
            }else
                high = (mid-1);
                mid = (low + (high-low)/2);
        }
        if (arr[high] == x) {
            mid = high;
        }
        if (arr[low] == x) {
            mid = low;
        }
        System.out.println(arr[mid] == x ? mid : "Element missing!");
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8, 9, 12, 35};
        // проверка
        search(arr, 1);
        search(arr, 3);
        search(arr, 4);
        search(arr, 7);
        search(arr, 8);
        search(arr, 9);
        search(arr, 12);
        search(arr, 35);
        search(arr, -3);
        search(arr, 0);
    }
}