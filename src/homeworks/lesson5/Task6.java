package homeworks.lesson5;

public class Task6 {
    /*Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.(Задание с урока.)
     * */
    public static void main(String[] args) {
        int n = 0;
        do {
            if (n % 5 == 0 && n != 0) {
                System.out.println("tick " + n);
            }
            n++;
        } while (n <= 100);

    }
}
