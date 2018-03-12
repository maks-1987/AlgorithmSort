package ProcedurJava.LoopAndRecursion;

public class TestFor1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // 10 не задействуется
            System.out.print(i + " ");
        }
        //компилятор пропускает, ошибки исполнения не будет
        for ( ; ; ) {

        }
    }
}
