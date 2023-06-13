//Необходимо написать алгоритм поиска всех доступных комбинаций для
//количества кубиков K с количеством граней N.
//● Вариант 1: количество кубиков может быть строго ограничено (4 кубика, например)
//● Вариант 2: либо их количество будет динамическим (N задает пользователь)
//● Определить сложность полученного варианта решения
public class Task3 {
    public static int Cubs(int K, int N) {
        return Cubs(K, N, 1);
    }
    private static int Cubs(int K, int N, int H){
        if(H == K + 1){
            return 1;
        }
        int res = 0;
        for (int g = 1; g <= N ; g++) {
            res += Cubs(K, N, H + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Cubs(4, 6));
    }
}
