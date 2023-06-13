import java.util.Date;
import java.util.Random;

//Дано целое число N из отрезка [1; 1000]. Также даны N целых чисел Ai из отрезка [1; 1000000].
//Требуется для каждого числа Ai вывести количество различных делителей этого числа.
//В этой задаче несколько верных решений, попробуйте найти наиболее оптимальное.
//Для полученного решения укажите сложность в О-нотации.
public class HW1 {
    public static void countDivider1(int N){ //O(n^2)
        for (int i = 1; i <= N; i++) {
            Random random = new Random();
            int Ai = random.nextInt(1000000) + 1;
            int countDivider = 0;

            for (int k = 1; k <= Ai; k++) {
                if (Ai % k == 0){
                    countDivider++;
                }
            }
            System.out.printf("Ai = %d : count = %d%n", Ai, countDivider);
        }
        System.out.println("------------------");
    }

    public static void countDivider2(int N){ //O(n*(n^0.5))
        for (int i = 1; i <= N; i++) {
            Random random = new Random();
            int Ai = random.nextInt(1000000) + 1;
            int countDivider = 0;
            int sqrtAi = (int) Math.sqrt(Ai);

            for (int k = 2; k <= sqrtAi; k++) {
                if (Ai % k == 0){
                    countDivider++;
                }
            }
            int result = (countDivider + 1)*2;
            System.out.printf("Ai = %d : count = %d%n", Ai, result);
        }
        System.out.println("------------------");
    }

    public static void test(){
        Date start1 = new Date();
        countDivider1(1000);
        Date end1 = new Date();

        long time1 = end1.getTime() - start1.getTime();


        Date start2 = new Date();
        countDivider2(1000);
        Date end2 = new Date();

        long time2 = end2.getTime() - start2.getTime();

        System.out.printf("time O(n^2) = %d%n", time1);
        System.out.printf("time O(n*(n^0.5)) = %d%n", time2);
    }
    public static void main(String[] args) {
        test();
    }
}
