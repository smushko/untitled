package homeworks.lesson4;

public class Task3 {
    public static void main(String[] args) {
        /*Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
        В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
            a) методкоторый будет мигать лампочками гирлянды заданное количество раз (операция ~);
            б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
            в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
            г) метод который будет распечатывать текущее состояние гирлянды.
        Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).*/
        double a = Math.random() * 0x7fffffff;
        int b = (int) a;
        System.out.println(String.format("исходный:" + "%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        //blinkLamp(b, 5);
        //runingLampToRight(b, 32);
        printStateLamp(b);
        System.out.println("лампа на первой позиции включена: " + checkFirstLampState(b));

    }



    public static void printStateLamp(int lampstate) {
        System.out.println(String.format("%32s", Integer.toBinaryString(lampstate)).replace(' ', '0'));
    }

    public static boolean checkFirstLampState(int lampstate) {
        if ((lampstate & 2) == 2) {
            return false;
        } else {
            return true;
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
