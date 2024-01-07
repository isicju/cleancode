package answer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;//OK
import java.util.UUID;
import java.util.logging.Logger;
import java.util.regex.Pattern;
//Неиспользуемый импорт
import java.util.ArrayList;
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    //Регулярное выражение с потенциальной DOS атакой
    private static final Pattern CATASTROHPIC_PATTERN = Pattern.compile("^(\\s*\\(+\\s*\\))+[^()]*$");
    //Нефинальная статическая переменная
    private static int counter = 0;
    //Нефинальная статическая переменная
    private static final int some_constant = 0;
    public static void main(String[] args) throws Exception {
        System.out.println(CATASTROHPIC_PATTERN);
        System.out.println(counter);
        System.out.println(some_constant);
        //Незакрытый стрим OK
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("somefile"));
        System.out.println(inputStream.readAllBytes().length);
        //Указание пароля в коде
        String password =  System.getenv("MY_APP_PASSWORD");;
        System.out.println(password);
        //Логирование без логера
        System.out.println("Printing without logger");
        //Сравнение по ссылке а не через equals
        String one = UUID.randomUUID().toString();
        String two = UUID.randomUUID().toString();
        if (one == two) {
            System.out.println("integer are equal");
        }
        //Деление на ноль OK
        int value = 100 / 0;
        System.out.println(value);
    }
    //Неиспользуемый параметр OK
    public void unusedParameter(int x, int y) {
        System.out.println(x);
    }
}