import java.util.Date;
import java.util.Timer;

//Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
//Считаем, что 1 и 2 значения последовательности равны 1. Искать будем
//по формуле F(n) = F(n-1) + F(n-2), что предполагает использование рекурсивного алгоритма.
//● F(n) = F(n-1) + F(n-2)
//● Используем рекурсию для решения
//● Рекурсия заканчивается на значениях 1 и 2
public class Task4 {
    public static long F1(int N){
        if(N <= 2) return 1;
        return F1(N-1) + F1(N-2);
    }

    public static long F2(int N){
        if(N <= 2) return 1;

        long[] F = new long[N + 1];
        F[1] = 1;
        F[2] = 1;

        for (int i = 3; i <= N ; i++) {
            F[i] = F[i-1] + F[i-2];
        }

        return F[N];
    }

    public static void test(){
        for (int N = 10; N <= 50 ; N++) {
            Date start = new Date();
            F1(N);
            Date end = new Date();
            long time1 = end.getTime() - start.getTime();

            start = new Date();
            F2(N);
            end = new Date();
            long time2 = end.getTime() - start.getTime();

            System.out.printf("N = %d: time1 = %d, time2 = %d%n", N, time1, time2);
        }
    }

    public static void main(String[] args) {
//        System.out.println(F1(10));
//        System.out.println(F2(50));

//        test();
        System.out.println(6%3);
    }
}
