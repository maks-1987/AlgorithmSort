package ProcedurJava.LoopAndRecursion;

class Fibonachi {
    static int fib(int i) {
        if (i <= 2) {
            return i;
        }else{
            i = ((i-1) +(i-2));
            return i;
        }
        /*switch (i) {
            case 1:return i;
            case 2:return i;
            case 3:return ((i - 1) + (i - 2));

            default:System.out.println("Nothing");
                break;
        }
        return i;*/
        //System.out.print(i);
    }
    public static void main(String[] args) {
        /*fib(1);
        fib(2);
        fib(3);*/
        System.out.print(fib(5)+"\n" + fib(2)+"\n" + fib(0));
    }
}
