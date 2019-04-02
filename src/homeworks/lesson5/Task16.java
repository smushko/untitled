package homeworks.lesson5;
/*
  Изменить программу сортировки пузырьком:
  а) добавить возможность досрочного окончания сортировки;
  б) программа написана таким образом, что минимальный элемент
  "всплывает" в начало массива. Измените программу так чтобы
  минимальный элемент "всплывал" в конец массива (внутренний
  цикл for должен перебирать элементы не с конца, а с начала).
 */

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        boolean sortirovkaDone = false;
        int lengthArray = 12;
        int[] randomNumbers = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            double a = Math.random() * lengthArray;
            randomNumbers[i] = (int) a;
        }
        System.out.println("исходный массив: " + Arrays.toString(randomNumbers));

        for (int i = 0; i < randomNumbers.length; i++) {
            if (!sortirovkaDone) {
                sortirovkaDone = true;
                for (int j = 0; randomNumbers.length - 1 - i > j; j++) {
                    if (randomNumbers[j] < randomNumbers[j + 1]) {
                        sortirovkaDone = false;
                        int tmp = randomNumbers[j + 1];
                        randomNumbers[j + 1] = randomNumbers[j];
                        randomNumbers[j] = tmp;
                    }
                }
            }
        }
        System.out.println("отсортированный массив: " + Arrays.toString(randomNumbers));
    }
}
