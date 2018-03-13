package ProcedurJava.LoopAndRecursion;

public class TestFor4 {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k += 2) { // шаг через ДВА ЗНАЧЕНИЯ, начнется
            System.out.print(k + " ");    // с 0 закончит на 8
        }

        System.out.println();

        // НЕВЕРНОЕ решение!!! Будет работать примерно в 2 раза ДОЛЬШЕ
        // конвеерные архитектуры в Википедии (if-ы - плохо, +, - нормально
        for (int k = 0; k < 10; k++) {
            if (k % 2 == 0) { // проверка: остаток от деления долж быть НОЛЬ
                System.out.print(k + " ");
            }
        }
    }
}/*
>>>     0 2 4 6 8
        0 2 4 6 8
*/
