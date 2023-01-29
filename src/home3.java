import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class home3 {
    public static void main(String[] args) {
        //ex();
        ex1();
    }

    static void ex() {
        /*Пусть дан произвольный список целых чисел,
        удалить из него четные числа*/
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    static void ex1() {
        /*Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее арифметическое из этого списка.
        Collections.max()*/
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        System.out.println();
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(arf(list));
    }

    static double arf(List<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
        return sum/list.size();

    }
}
