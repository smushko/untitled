package homeworks.lesson12.task13;
/*
 * Предложение состоит из нескольких слов, например:
 * "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554".
 * Среди слов, состоящих только из цифр, найти слово-палиндром.
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        String str = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        String mask = "[0-9]+";
        Pattern pattern = Pattern.compile(mask);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            StringBuffer sbf = new StringBuffer(matcher.group());
            if (sbf.toString().equals(sbf.reverse().toString())) {
                System.out.printf("в целевой строке цифровой палиндром № %s : %s %n", counter++, sbf);
            }
        }
    }
}
