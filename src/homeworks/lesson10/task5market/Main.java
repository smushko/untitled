package homeworks.lesson10.task5market;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item[] items = {new Item(1, "Сок", Category.DRINK, 25),
                new Item(2, "Минеральная вода", Category.DRINK, 12),
                new Item(3, "Хлеб", Category.FOOD, 15),
                new Item(4, "Масло", Category.FOOD, 35),
                new Item(5, "Футболка", Category.CLOTHIN, 100),
                new Item(6, "Штаны", Category.CLOTHIN, 150)};
        Scanner sc = new Scanner(System.in);

        System.out.println("введите логин");
        String a = sc.nextLine();
        System.out.println("введите пароль");
        User user1 = new User(a, sc.nextLine());

        System.out.println();
        System.out.println("пользователь");
        System.out.println(user1.toString());

        System.out.println();
        System.out.println("каталог всех товаров");
        for (Item i : items) {
            if (i instanceof Category.FOOD){
                i.toString();
            }
        }
    }
}
