package ProcedurJava.LoopAndRecursion.Sort;

class BinarySearch2 {
    // поиск принимает массив и число для поиска
    static void search(int[] arr, int t) {
        int low = 0;
        int high = arr.length-1;
        int mid = (low + high)/2; // (0+11)/2=5
        //System.out.println(mid);

        while (arr[mid] != t & high != mid & low != mid) {
            if (arr[mid] < t) {
                low = (mid+1);
                mid = (low + high)/2;
            }else
                high = (mid-1);
                mid = (low + high)/2;
        }
        if (arr[high] == t) {
            mid = high;
        }
        if (arr[low] == t) {
            mid = low;
        }
        System.out.println(arr[mid] == t ? mid : "Element missing!");
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8, 9, 12, 35};

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