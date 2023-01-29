import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;


public class home2 {
    public static void main(String[] args) throws IOException {

        /*Дана json строка
        {{ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}}
        Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
        Студент Иванов получил 5 по предмету Математика.
        Студент Петрова получил 4 по предмету Информатика.
        Студент Краснов получил 5 по предмету Физика.
        Используйте StringBuilder для подготовки ответа*/

        String str = "{[{ \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]}";

        rev(str);

    }

    static void rev(String str) throws IOException {
        str = str.substring(4, str.length() - 4);
        String str1 = str.replace("{", "");
        String str2 = str1.replace("\"", "");
        String str3 = str2.replace("}", "");
        String str4 = str3.replace(":", ",");
        String[] chang = str4.split(",");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chang.length; i++) {
            if (i == 1 || i == 7 || i == 13) {
                sb.append("Студент ");
                sb.append(chang[i]);
            }
            if (i == 3 || i == 9 || i == 15) {
                sb.append(" получил ");
                sb.append(chang[i]);
            }
            if (i == 5 || i == 11 || i == 17) {
                sb.append(" по предмету ");
                sb.append(chang[i]);
                sb.append("\n");
            }
        }
        System.out.println(sb);
        Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.INFO, "Все хорошо");
        SimpleFormatter formatter = new SimpleFormatter();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fileHandler);

        try (FileWriter fileWriter = new FileWriter("file.txt", false)) {
            fileWriter.write(sb.toString());
        } catch (Exception e) {
            logger.log(Level.INFO, "Good");
            e.printStackTrace();
        }

    }

}




