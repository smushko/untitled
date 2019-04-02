package homeworks.lesson5;
/**
 * Реализовать задачу с гирляндой используя массивы. Для реализации бегущей строки используйте метод System.arraycopy(...);
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int lengthArray = 32;
        int quantity_move = 10;

        int[] randomNumbers = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            double a = Math.random() * 2;
            randomNumbers[i] = (int) a;
        }
        System.out.println("исходный массив: " + Arrays.toString(randomNumbers));

        Scanner sc = new Scanner(System.in);

        System.out.println("выберите  режим работы гирлянды:");
        System.out.println("1 - мигание");
        System.out.println("2 - бегущая строка");
        int work_mode = sc.nextInt();


        switch (work_mode) {
            case 1:
                blinkLamp(randomNumbers, 5);
                break;
            case 2:
                runingString(randomNumbers, 5);
                break;
            default:
                System.out.println("выбран некорректный режим");
        }
    }

    public static void blinkLamp(int[] lampstate, int quantity) {
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < lampstate.length; j++) {
                if (lampstate[j] == 1) {
                    lampstate[j] = 0;
                } else {
                    lampstate[j] = 1;
                }
            }
            System.out.println("инвертированный массив: " + Arrays.toString(lampstate));
        }
    }

    private static void runingString(int[] randomNumbers, int quantity) {
        for (int i = 0; i < quantity; i++) {
            int tmp = randomNumbers[randomNumbers.length - 1];
            System.arraycopy(randomNumbers, 0, randomNumbers, 1, randomNumbers.length - 1);
            randomNumbers[0] = tmp;
            System.out.println("подвинут массив: " + Arrays.toString(randomNumbers));
        }
    }
}