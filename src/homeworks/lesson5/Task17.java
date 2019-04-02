package homeworks.lesson5;

import java.util.Arrays;

/**
 * Создать двухмерный массив 5х8 и инициализировать его
 * с помощью блока для инициализации. Найти максимальное
 * и минимальное значение в каждой "строке" и записать
 * эти значения в двухмерный массив 5х2. Распечатать оба массива.
 */

public class Task17 {
    public static void main(String[] args) {
        int quantityString = 5;
        int quantityColumn = 8;
        int maxValue = 99;
        int[][] randomNumbers = new int[quantityString][quantityColumn];
        int[][] resultArray = new int[5][2];

        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers[0].length; j++) {
                double a = Math.random() * maxValue;
                randomNumbers[i][j] = (int) a;
            }
        }
        System.out.println("исходный массив:");
        printOnScreenArray(randomNumbers);

        for (int i = 0; i < quantityString; i++) {
            resultArray[i][0] = maxValueOnSting(randomNumbers, i);
            resultArray[i][1] = minValueOnSting(randomNumbers, i);
        }
        System.out.println("результативный массив:");
        printOnScreenArray(resultArray);
    }

    static void printOnScreenArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    static int maxValueOnSting(int[][] array, int numberString) {
        int max = array[numberString][0];
        for (int i = 1; i < (array[numberString].length); i++) {
            if (max < array[numberString][i]) {
                max = array[numberString][i];
            }
        }
        return max;
    }

    static int minValueOnSting(int[][] array, int numberString) {
        int min = array[numberString][0];
        for (int i = 1; i < (array[numberString].length); i++) {
            if (min > array[numberString][i]) {
                min = array[numberString][i];
            }
        }
        return min;
    }
}






