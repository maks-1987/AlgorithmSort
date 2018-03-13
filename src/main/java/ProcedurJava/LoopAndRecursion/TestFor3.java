package ProcedurJava.LoopAndRecursion;

class TestFor3 {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " "); // arr[k] - k используется как индекс
                                            // и работает со значением ЭЛЕМЕНТА по
                                            // этому индексу
        }
    }
}/*
>>>  0 10 20 30 40 50 60 70 80 90
*/
