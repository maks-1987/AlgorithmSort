package ProcedurJava.LoopAndRecursion;

/**
 * Можно "цеплять" внутренний цикл за внешний
 */
class TestPyramidFor {
    private static int j; // если закомментир строку цикл for(j...) не пропускает

    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40};
        for (int i = 0; i < arr.length; i++) {
            // Для этого цикла i является КОНСТАНТОЙ
            for (j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}/*
>>>     0
        0 10
        0 10 20
        0 10 20 30
        0 10 20 30 40
*/