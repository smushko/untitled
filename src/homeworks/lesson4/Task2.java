package homeworks.lesson4;

import java.util.Scanner;

public class Task2 {
    /**
     * Создать программу, которая будет выводить на экран
     * меньшее по модулю из трёх введённых пользователем
     * вещественных чисел. Для вычисления модуля используйте
     * тернарную условную операцию.
     */
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0, minmodule = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("введите 1-е целое число из 3: ");
        if (sc.hasNextInt() == false) {
            System.out.print("число нецелое");
        } else {
            num1 = sc.nextInt();
            System.out.print("введите 2-е целое число из 3: ");
            if (sc.hasNextInt() == false) {
                System.out.print("число нецелое");
            } else {
                num2 = sc.nextInt();
                System.out.print("введите 3-е целое число из 3: ");
                if (sc.hasNextInt() == false) {
                    System.out.println("число нецелое");
                } else {
                    num3 = sc.nextInt();
                }
            }
        }
        minmodule = Math.abs(num1) < Math.abs(num2) && Math.abs(num1) < Math.abs(num3) ? num1 : (Math.abs(num2) < Math.abs(num1) && Math.abs(num2) < Math.abs(num3) ? num2 : num3);
        System.out.println("меньшее, по модулю, из трех чисел: " + minmodule);
    }
}
