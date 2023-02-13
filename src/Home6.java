import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Home6 {
    public static void main(String[] args) {
        ArrayList<String > arrayList = laptops();
        HashMap<Integer, String> hashMap = userEnter();
        System.out.println(screening(hashMap, arrayList));
    }

    static HashMap<Integer, String> userEnter() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> hashMap = new HashMap<>();
        boolean i = true;
        while (i) {
            System.out.println("Давайте подберем Вам ноутбук");
            System.out.println("Введите цифру: ");
            System.out.println("1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет\n"+
                    "5 - Закончить ");
            String str = scanner.nextLine();
            if (str.equals("1")) {
                String option = "2 Гигабайт";
                String option2 = "4 Гигабайта";
                System.out.println("1: " + option + "\n" +
                        "2: " + option2);
                String str1 = scanner.nextLine();
                if (str1.equals(option)) {
                    hashMap.put(1, option);
                } else {
                    hashMap.put(1, option2);
                }
            }
            if (str.equals("2")) {
                String option = "256 Гигабайт";
                String option2 = "512 Гигабайт";
                String option3 = "1000 Гигабайт";
                System.out.println("1: " + option + "\n" +
                        "2: " + option2+ "\n"+
                        "3: " + option3);
                String str1 = scanner.nextLine();
                if (str1.equals(option)) {
                    hashMap.put(2, option);
                } else if (str1.equals(option2)) {
                    hashMap.put(2, option2);
                } else {
                    hashMap.put(2, option3);
                }
            }
            if (str.equals("3")) {
                String option = "Windows";
                String option2 = "Linux";
                System.out.println("1: " + option + "\n" +
                        "2: " + option2);
                String str1 = scanner.nextLine();
                if (str1.equals(option)) {
                    hashMap.put(3, option);
                } else {
                    hashMap.put(3, option2);
                }
            }
            if (str.equals("4")) {
                String option = "Синий";
                String option2 = "Черный";
                String option3 = "Белый";
                System.out.println("1: " + option + "\n" +
                        "2: " + option2+ "\n"+
                        "3: " + option3);
                String str1 = scanner.nextLine();
                if (str1.equals(option)) {
                    hashMap.put(4, option);
                } else if (str1.equals(option2)) {
                    hashMap.put(4, option2);
                } else {
                    hashMap.put(4, option3);
                }
            }
            if (str.equals("5")){
                i = false;
            }
        }
        return hashMap;
    }

    static ArrayList<String> screening(HashMap<Integer, String> hashMap, ArrayList<String> arrayList){
        ArrayList<String> result = new ArrayList<>();

        for (String val: hashMap.values()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i).contains(val)){
                    result.add(arrayList.get(i));
                }
            }
        }
        return result;
    }

    static ArrayList<String > laptops(){
        Laptop laptop1 = new Laptop();
        laptop1.brand = "Samsung";
        laptop1.operatingSystem = "Windows 10";
        laptop1.obHardDisk = 512;
        laptop1.obRam = 8;
        laptop1.color = "Красный";

        Laptop laptop2 = new Laptop();
        laptop2.setLaptop("Lenovo", 4, 256, "Windows", "Черный");

        Laptop laptop3 = new Laptop();
        laptop3.setLaptop("Acer", 2, 512, "Linux", "Синий");

        Laptop laptop4 = new Laptop();
        laptop4.setLaptop("HP", 4, 512, "Windows", "Белый");

        Laptop laptop5 = new Laptop();
        laptop5.setLaptop("Asus", 2, 1000, "Linux", "Черный");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(String.valueOf(laptop1));
        arrayList.add(String.valueOf(laptop2));
        arrayList.add(String.valueOf(laptop3));
        arrayList.add(String.valueOf(laptop4));
        arrayList.add(String.valueOf(laptop5));
        return arrayList;
    }
}
