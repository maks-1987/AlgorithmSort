package ProcedurJava.Sort;

class BinarySearchTest {
    public static void main(String[] args) {
        double[] arr = {-16, -9, -5, 0, 3, 7, 12, 18,
                        20, 24, 30, 32, 38, 47, 50};
        BinarySearch1 binarySearch1 = new BinarySearch1(arr);
        // будет выводить номер индекса массива, если найдет х,
        // иначе выводит -1 (значения в массиве нет)
        System.out.println("Число 0 под индексом: " +binarySearch1.find(0));
        System.out.println("Число 51 под индексом: " +binarySearch1.find(51));
        System.out.println("Число 5 под индексом: " +binarySearch1.find(5));
        System.out.println("Число -5 под индексом: " +binarySearch1.find(-5));
    }
}/*
        Число 0 под индексом: 3
        Число 51 под индексом: -1
        Число 5 под индексом: -1
        Число -5 под индексом: 2
*/