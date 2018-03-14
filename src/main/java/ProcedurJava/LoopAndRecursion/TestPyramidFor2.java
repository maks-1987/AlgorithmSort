package ProcedurJava.LoopAndRecursion;

class TestPyramidFor2 {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40};
        for (int i = arr.length - 1; i >=0; i--) {
        //for (int i = arr.length; i >= 0; i--) { // так тоже будет работать
            // на входе в цикл i = 4, т.е. длина массива - 1 = 4
            // на этапе проверки j<=4 цикл запустится еще раз т.к.
            // j может быть меньше и РАВЕН числу i (4)
            for (int j = 0; j < i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}/*
>>>     0 10 20 30 40
        0 10 20 30
        0 10 20
        0 10
        0
*/