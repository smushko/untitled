package homeworks.lesson4;

import java.util.Scanner;

public class Task4 {
/*Вычислить среднее значение трех вещественных чисел передаваемых навход программы
в качестве аргументов. Для преобразования из String в double используйте метод*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите 1-е число из 3:");
        String n1 = sc.nextLine();
        System.out.println("введите 2-е число из 3:");
        String n2 = sc.nextLine();
        System.out.println("введите 3-е число из 3:");
        String n3 = sc.nextLine();

        double avg = (Double.parseDouble(n1)+Double.parseDouble(n2)+Double.parseDouble(n3))/3;
        System.out.println("среднее:" + avg);

    }
}
