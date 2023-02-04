import java.util.LinkedList;
import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
//        ex0();
//        ex2();
        ex1();
    }

    static void ex0() {
        /*Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.*/

        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел ");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        scanner.close();
        revers(list);
    }

    static void revers(LinkedList<Integer> list) {
        System.out.println(list);
        LinkedList<Integer> list1 = new LinkedList<>();
        boolean x = true;
        int size = list.size();
        while (x) {
            if (size == 0) {
                x = false;
            } else {
                list1.add(list.getLast());
                list.removeLast();
                size--;
            }
        }
        System.out.println(list1);
    }

    static void ex1(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел ");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        scanner.close();
        System.out.println(list);
        MyClass myClass = new MyClass(list);
        myClass.enqueue(list,1);
        System.out.println(list);
        System.out.println();
        myClass.first(list);
        System.out.println(list);
        System.out.println();
        myClass.dequeue(list);
        System.out.println(list);
    }

    static void ex2() {
        /*Найдите сумму всех элементов LinkedList,
        сохраняя все элементы в списке. Используйте итератор*/

        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел ");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }
        scanner.close();
        sum(list);
    }
    static void sum(LinkedList<Integer> list){
        int sum = 0;
        for (Integer integer:list) {
            sum += integer;
        }
        System.out.println(sum);
        System.out.println(list);
    }

}
