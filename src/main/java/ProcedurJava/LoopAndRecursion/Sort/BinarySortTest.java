package ProcedurJava.LoopAndRecursion.Sort;

class BinarySortTest {
    public static void main(String[] args) {
        double[] arr = {-16, -9, -5, 0, 3, 7, 12, 18,
                        20, 24, 30, 32, 38, 47, 50};
        BinarySearch1 binarySearch1 = new BinarySearch1(arr);
        // будет выводить номер индекса массива, если найдет х,
        // иначе выводит -1 (значения в массиве нет)
        System.out.println("Номер индекса: " +binarySearch1.find(0));
        System.out.println("Номер индекса: " +binarySearch1.find(51));
        System.out.println("Номер индекса: " +binarySearch1.find(5));
        System.out.println("Номер индекса: " +binarySearch1.find(-5));
    }
}/*
        Номер индекса: 3
        Номер индекса: -1
        Номер индекса: -1
        Номер индекса: 2
*/