package ProcedurJava.Sort;

/**
 * Сортировка слиянием. Для сортировки массива нужно поделить его пополам
 * отсортировать (рекурсивно) эти половины  и слить результаты. Достоинство:
 * гарантированное время сортировки любого массива из N элементов за время,
 * пропорциональное NlogN. Недостаток: требование доп. памяти с объемом,
 * пропорц-ным N.
 */
class MergeSort_2 {
    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;

        int[] L = new int [n1];
        int[] R = new int [n2];

        for(int i=0; i<n1; i++)
            L[i] = arr[l+i];
        for(int j=0; j<n2; j++)
            R[j] = arr[m+1+j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void MergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l+(r-l)/2;
            MergeSort(arr, l, m);// 1:(l=0,r=7,m=3); 2:(0,3,1); 3:(0,1,0)
            MergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    public static void main(String args[]) {
        int[] arr = {10, 54, 63, 6, -6, 33, 0, 420};
        MergeSort(arr, 0, arr.length-1); // length=8
        for (int a : arr) System.out.print(a + " ");

        System.out.println();
        int[] arr2 = {1, 23, 11, 2, 5, 66, -9};
        MergeSort(arr2, 0, arr2.length-1);
        for (int a : arr2) System.out.print(a + " ");
    }
}
