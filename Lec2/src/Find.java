public class Find {

// Поиск перебором
    public static int find(int[] array, int value){ // O(n)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }


// Бинарны поиск


    public static int binarySearch(int[] array, int value, int min, int max){ // O(log n)
        int midpoint;

        if (max < min){
          return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }

        if (array[midpoint]< value){
            return binarySearch(array, value, midpoint + 1, max);
        } else {
            if (array[midpoint] > value){
                return binarySearch(array, value, min, midpoint -1);
            } else {
                return midpoint;
            }
        }
    };

    public static int binarySearch(int[] array, int value){ // перегрузили функцию, чтобы в вызове не писать границы
        return binarySearch(array, value, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = new int[]{
              1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        System.out.println(binarySearch(array, 5));
    }
}
