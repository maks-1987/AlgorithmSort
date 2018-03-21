package ProcedurJava.Sort;

class QuickSort {
    static int ARRAY_LENGTH = 10;
    private static int[] array = {2,1,0,3,9,5,7,12,2,77};

    static void printArray() {
        for (int i=0; i<ARRAY_LENGTH-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH-1]);
    }
    static void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY_LENGTH - 1;
        doSort(startIndex, endIndex);
    }
    private static void doSort(int start, int end) {
        if (start >= end) return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            } if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur) cur = j;
                else if (j == cur) cur = i;
            }
        } doSort(start, cur);
        doSort(cur+1, end);
    }
    public static void main(String[] args) {
        printArray();
        quickSort();
        printArray();
    }
}
