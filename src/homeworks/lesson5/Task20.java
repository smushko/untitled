package homeworks.lesson5;
/*
  Изменить сортировку выбором - исключите обмен значений,
  если найденный минимальный элемент уже находится на своем месте.
  переработанная пузырьковая сортировка "task16"

  Изменить программу сортировки пузырьком:
  а) добавить возможность досрочного окончания сортировки;
  б) программа написана таким образом, что минимальный элемент
  "всплывает" в начало массива. Измените программу так чтобы
  минимальный элемент "всплывал" в конец массива (внутренний
  цикл for должен перебирать элементы не с конца, а с начала).
 */

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        boolean flag = false;
        int lengthArray = 12;
        int calc = 0;
        int[] randomNumbers = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            double a = Math.random() * lengthArray;
            randomNumbers[i] = (int) a;
        }
        System.out.println("исходный массив: " + Arrays.toString(randomNumbers));

        for (int i = 0; i < randomNumbers.length; i++) {
            int j, tmp, location = 0;
            for (j = i; randomNumbers.length - 1 > j; j++) {
                if (randomNumbers[i] > randomNumbers[j + 1]) {
                    location = j + 1;
                }

            }
            tmp = randomNumbers[location];
            randomNumbers[location] = randomNumbers[i];
            randomNumbers[i] = tmp;
            System.out.println("aтсортированный массив: " + Arrays.toString(randomNumbers) + calc++);
        }
    }
}
