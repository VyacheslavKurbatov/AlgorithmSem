//Необходимо написать один из простых алгоритмов сортировки, имеющий сложность O(N2).
//● Сортировка пузырьком
//● Сортировка выбором
//● Сортировка вставками

import java.util.Date;

public class Task1 {
    final static int[] buf = new int[100000];

    // Шейкерная сортировка
    public static void shakeSort(int[] array){ // O(N^2)
        for (int i = 0; i < array.length/2; i++) {
            for (int j = i; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            for (int j = array.length - i - 1; j > i; j--) {
                if(array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Сортировка слиянием

    public static void mergeSort(int[] array){      // O(N*logN)
        mergeSort(array, 0, array.length - 1);
    }
    private static void mergeSort(int[] array, int left, int right){
        if(left == right){
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        //Слияние
        int i = left, j = mid + 1, k = left;

        while(i <= mid && j <= right){
            if(array[i] < array[j]){
                buf[k] = array[i];
                i++;
            }else{
                buf[k] = array[j];
                j++;
            }
            k++;
        }

        while (i <= mid){
            buf[k++] = array[i++];
        }

        while (j <= right){
            buf[k++] = array[j++];
        }

        for (int l = left; l <= right; l++) {
            array[l] = buf[l];
        }
    }

    // Бинарный поиск (итеративный)

    public static Integer binarySearch(int[] array, int value){
        int left = 0, right = array.length - 1;
        while (right - left > 1){ // abs(right-left) > eps (1e-9)
            int mid = (left + right) / 2;
            if(array[mid] > value){
                right = mid;
            } else {
                left = mid;
            }
        }
        if(array[left] == value) return left;
        if(array[right] == value) return left;

        return null;
    }

    public static void main(String[] args) {
        int N = 100000;
        int[] array1 = new int[N];
//        int[] array2 = new int[N];

        for (int i = 0; i < N; i++) {
            array1[i] = (int) (Math.random() * 1000);
//            array2[i] = array1[i];
        }

//        for(int a : array1)
//            System.out.printf("%d ", a);
//        System.out.println();

//        Date start = new Date();
//        shakeSort(array1);
//        Date end = new Date();
//        long time1 = end.getTime() - start.getTime();

//        start = new Date();
        mergeSort(array1);
//        end = new Date();
//        long time2 = end.getTime() - start.getTime();

//        System.out.printf("time1 = %d, time2 = %d%n", time1, time2);

//        for(int a : array1)
//            System.out.printf("%d ", a);
//        System.out.println();

        System.out.println(binarySearch(array1, 555));
    }
}
