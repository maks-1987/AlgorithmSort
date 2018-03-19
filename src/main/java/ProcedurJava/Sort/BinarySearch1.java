package ProcedurJava.Sort;
/* В стандартной библиотеке Java уже имеется реализация двоичного
поиска (который при этом может быть расширен через интерфейс Comparator).
Для объектных типов данных общий вид метода выглядит так:
java.util.Arrays.binarySearch(T[] array, T value[, Comparator c])
 */
class BinarySearch1 {
    private double[] array;

    BinarySearch1(double[] array) {
        this.array = array;
    }
    // алгоритм поиска
    int find(double x) {
        int i = -1;
        if (this.array != null) {
            int low = 0, high = this.array.length, mid;
            while (low < high) {
                mid = (low + high) / 2; // Можно заменить на:
                // (low + high) >>> 1, чтоб не возникло переполнение целого
                if (x == this.array[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < this.array[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
}
