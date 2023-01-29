import java.util.Arrays;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
       /* Задано уравнение вида q + w = e, q, w, e >= 0.
       Некоторые цифры могут быть заменены знаком вопроса,
       например 2? + ?5 = 69.
       Требуется восстановить выражение до верного равенства.
       Предложить хотя бы одно решение или сообщить, что его нет.*/


        String str = "2? + ?5 = 69";
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));

    }

    static void sumnum() {
        /*Вычислить n-ое треугольного число(сумма чисел от 1 до n)*/
        System.out.println("Введите число: ");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        int i = 0;
        int x = 0;
        while (i <= a) {
            x = x + i;
            i++;
        }
        System.out.println(x);
    }

    static void factorial() {
        /* Вычислить n! (произведение чисел от 1 до n)*/
        System.out.println("Введите число: ");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        int i = 1;
        int x = 1;
        while (i <= a) {
            x = x * i;
            i++;
        }
        System.out.println(x);
    }

    static void primeNum()
    {
        /* Вывести все простые числа от 1 до 1000
        (простые числа - это числа которые делятся только на себя и на единицу
        без остатка. Чтобы найти остаток от деления используйте оператор % ,
        например 10%3 будет равно единице)*/
        int a = 1000;
        System.out.println("Все простые числа от 1 до 1000");
        boolean b = true;
        for (int i = 2; i <= a; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(i);
            } else {
                b = true;
            }
        }
    }

    static void calc(){
        System.out.println("Введите число a: ");
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        System.out.println("Введите число b: ");
        int b = scaner.nextInt();
        System.out.println("Введите знак: ");
        char name = scaner.next().charAt(0);

        if (name == '+') {
            System.out.println("Результат: " + (a + b));
        }
        if (name == '-') {
            System.out.println("Результат: " + (a - b));
        }
        if (name== '/') {
            System.out.println("Результат: " + (a / b));
        }
        if (name == '*'){
            System.out.println("Результат: " + (a * b));
        }
    }


}
