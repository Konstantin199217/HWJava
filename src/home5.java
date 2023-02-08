import java.util.*;

public class home5 {
    public static void main(String[] args) {

//        ex0();
        ex1();
    }

    static void ex0() {
        /*Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
         что 1 человек может иметь несколько телефонов.*/
        String s = "Ivan 8999984 elena 4534532 Ivan 342342 alla 2333333 Ivan 55555 elena 3434343";
        String[] str = s.split(" ");
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            if (hashMap.containsKey(str[i])) {
                List<String> list = hashMap.get(str[i]);
                list.add(str[i + 1]);
            } else {
                if (i % 2 == 0) {
                    List<String> list = new ArrayList<>();
                    list.add(str[i + 1]);
                    hashMap.put(str[i], list);
                }
            }
        }
        System.out.println(hashMap);
    }

    static void ex1() {
        /*Пусть дан список сотрудников:
        Иван Иванов,
        Светлана Петрова, Кристина Белова, Анна Мусина,
        Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов,
        Петр Чернышов, Мария Федорова, Марина Светлова,
        Мария Савина, Мария Рыкова, Марина Лугова,
        Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.

        Написать программу, которая найдет и выведет повторяющиеся имена
        с количеством повторений. Отсортировать по убыванию популярности.
        Для сортировки использовать TreeMap.*/

        String s = "Иван Иванов, " +
                "Светлана Петрова, Кристина Белова, Анна Мусина, " +
                "Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, " +
                "Петр Чернышов, Мария Федорова, Марина Светлова, " +
                "Мария Савина, Мария Рыкова, Марина Лугова, " +
                "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String s1 = s.replace(",", "");
        String[] name = s1.split(" ");
        int x = 0;
//        for (int i = 0; i < name.length; i++) {
//            if (name[i].equals("Иван")){
//                x++;
//            }
//        }
//        System.out.println(x);
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        int count = 1;
        for (int i = 0; i < name.length; i++) {

            if (i % 2 == 0) {
                if (treeMap.containsKey(name[i])) {
                    count = treeMap.get(name[i]);
                    count++;
                    treeMap.put(name[i], count);
                }else{
                    count = 1;
                    treeMap.put(name[i], count);
                }
            }
        }
        List list = new ArrayList(treeMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b)
            {
                return b.getValue() - a.getValue();
            }
        });
        System.out.println(list);
    }

}
