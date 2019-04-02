package homeworks.lesson5;

public class Task9 {
    public static void main(String[] args) {
        /**
         * Реализовать подсчет факториала используя цикл for.
         * n! = 1*2*...*n;​
         * 0!=1;
         * 5! = 1*2*3*4*5;
         * Число n задается случайным образом (используйте Math.random()).
         */
        double a = Math.random() * 9;
        int length_factorial = (int) a;
        int factorial = 1;
        System.out.println("длинна факториала: " + length_factorial);

        if (length_factorial == 0) {
            System.out.println("значение факториала равно: " + 1);
        } else {
            for (int i = 1; i <= length_factorial; i++){
                    factorial = factorial * i;

                }
            }
        System.out.println("значение факториала равно: " + factorial);
        }
    }
