package ProcedurJava.LoopAndRecursion;

class TestFor1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // 10 не задействуется
            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 9; i >= 0; i--) { // вывод в обратн сторону
            System.out.print(i + " ");
        }
        //компилятор пропускает, ошибки исполнения не будет
        for ( ; ; ) {

        }
    }
}/*
>>>     0 1 2 3 4 5 6 7 8 9
        9 8 7 6 5 4 3 2 1 0
*/