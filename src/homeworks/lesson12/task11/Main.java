package homeworks.lesson12.task11;

/*
* Найти слово, в котором число различных символов минимально.
* Слово может содержать буквы и цифры. Если таких слов несколько,
* найти первое из них. Например в строке "fffff ab f 1234 jkjk"
* найденное слово должно быть "fffff".
* */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int quantityWords = 0;
        int quantityMaxRepeatChar = 0;
        String wordWithMaxMatches = "";
        String sourceSting = " abcdef fffff ab f 1234 jkjk ggghhttrr ";
        String mask = "\\S+";
        Pattern pattern = Pattern.compile(mask);
        Matcher matcher = pattern.matcher(sourceSting);

        while (matcher.find()) {
            int countMathes = 0;
            String tmp = matcher.group();
            for (int i = 0; i <= tmp.length(); i++) {
                for (int j = i + 1; j < tmp.length(); j++) {
                    if (tmp.charAt(i) == tmp.charAt(j)) {
                        countMathes++;
                    }
                }
            }
            if (countMathes > quantityMaxRepeatChar) {
                quantityMaxRepeatChar = countMathes;
                wordWithMaxMatches = tmp;
            }
        }

        System.out.println(wordWithMaxMatches);
        //System.out.println(matcher.group());
    }
}
