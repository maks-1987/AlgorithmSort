package ProcedurJava.LoopAndRecursion;

/**
 * В Java есть понятие statement, expression. Statement - это все что угодно,
 * заканчивающееся " ; " (int x = 1;). Expression - все что имеет значение
 * и стоит в правой части присваивания. Требование к циклу: должен быть
 * statement (первое выраж и последнее выраж - тоже), посередине - expression
 * и оно boolean.
 *
 */
public class TestFor2 {
    private static int count = 1; // 1, 2, 3

    public static void main(String[] args) {
        for (a(); b(); c()) {
            x();
        }
    }

    private static void a() {
        System.out.println("1.a");
    }

    private static boolean b() {
        System.out.println("2.b");
        return count-- > 0; // один раз вернет true, потом только false
    }

    private static void c() {
        System.out.println("3.c");
    }

    private static void x() {
        System.out.println("x");
    }
}/*
>>> a
    c
*/
