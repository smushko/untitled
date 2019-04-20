package homeworks.lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int number = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("введите целое число:");
        if (sc.hasNextInt())
        {
            number = sc.nextInt();
            if (number % 2 == 0 )
            {
                System.out.println("число четное");
            }
            else
            {
                System.out.println("число не четное");
            }
        }
        else
        {
            System.out.println("число нецелое");
        }


    }

    public static class ForEach {
        public static void main(String[] args) {
            for (String str : args) {
                System.out.println("Value is: " + str);
            }
        }
    }
}
