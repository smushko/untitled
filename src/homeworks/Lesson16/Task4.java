package homeworks.Lesson16;

import java.util.*;

/*Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
Избавиться от повторяющихся элементов в строке и вывести результат на экран.*/
public class Task4 {
    public static void main(String[] args) {
        String s = "1, 2, 3, 4, 4, 5";
        List<String> numbers = new ArrayList<>();

        for (String retval : s.split(",")) {
            numbers.add(retval.replaceAll("\\D+", ""));
        }

        System.out.println("исходник:  "+numbers);
        int i = 0;

        while (i < numbers.size()-1) {
            if (numbers.get(i).equals(numbers.get(++i))) {
                numbers.remove(i);
            }
        }
        System.out.println("результат: "+numbers);
    }
}
