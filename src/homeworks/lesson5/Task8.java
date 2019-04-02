package homeworks.lesson5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        /*Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
        В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
            a) методкоторый будет мигать лампочками гирлянды заданное количество раз (операция ~);
            б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
            в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
            г) метод который будет распечатывать текущее состояние гирлянды.
        Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).

        Переписать гирлянду используя оператор switch для  выбора нужной операции.
        */
        double a = Math.random() * 0x7fffffff;
        int b = (int) a;
        Scanner sc = new Scanner(System.in);

        System.out.println(String.format("исходное состояние:" + "%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("выберите  режим работы гирлянды:");
        System.out.println("1 - мигание");
        System.out.println("2 - бегущая строка");
        int work_mode = sc.nextInt();


        switch (work_mode) {
            case 1:
                blinkLamp(b, 5);
                break;
            case 2:
                runingLampToRight(b, 8);
                break;
            default:
                System.out.println("выбран некорректный режим");
        }
    }

    public static void blinkLamp(int lampstate, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(String.format("%32s", Integer.toBinaryString(lampstate)).replace(' ', '0'));
            lampstate = ~lampstate;
        }
    }

    public static void runingLampToRight(int lampstate, int quantity_move) {
        for (int i = 0; i < quantity_move; i++) {
            int d;
            System.out.println(String.format("%32s", Integer.toBinaryString(lampstate)).replace(' ', '0'));

            if ((lampstate & 1) == 0 && lampstate < 0) {
                lampstate = lampstate >> 1;
                lampstate = lampstate & 0x7fffffff;
            } else if ((lampstate & 1) == 1 && lampstate > 0) {
                lampstate = lampstate >> 1;
                lampstate = lampstate | 0x80000000;
            } else {
                lampstate = lampstate >> 1;

            }
        }
    }
}
