package homeworks.lesson12.task12;

/*
* Предложение состоит из нескольких слов, разделенных пробелами.
* Например: "One two three раз два три one1 two2 123 ".
* Найти количество слов, содержащих только символы латинского алфавита.
* */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        String sourceSting = "One two three раз два три one1 two2 123 ";
        String mask = "\\D[a-zA-Z]+\\s";
        Pattern pattern = Pattern.compile(mask);
        Matcher matcher = pattern.matcher(sourceSting);

        while (matcher.find()) {
            counter ++;
        }
        System.out.printf("в целевой строке %s слов содержащих только латинские символы ", counter);


    }
}
