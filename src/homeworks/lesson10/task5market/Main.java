package homeworks.lesson10.task5market;

import java.util.ArrayList;
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
        ArrayList<Order> basket = new ArrayList<Order>();

        System.out.println("введите логин");
        String a = sc.nextLine();
        System.out.println("введите пароль");
        User user1 = new User(a, sc.nextLine());

        System.out.println();
        System.out.println("пользователь");
        System.out.println(user1.toString());

        PrintCategoryItems(items, Category.FOOD);
        PrintAllItems(items);

        System.out.println();
        System.out.println("для добавления товара в корзину введите его ID, для окончания выбора введите 0 или несуществующий ID");

        InsertItems(items, basket);

        System.out.println("в корзину добавлены товары: ");
        for (Item i : basket) {
            System.out.println(i.toString());
        }
    }

    private static void InsertItems(Item[] items, ArrayList<Item> basket) {
        Scanner sc = new Scanner(System.in);
        int valueInsert = Integer.parseInt(sc.nextLine());

        while (valueInsert != 0 && valueInsert > 0 && valueInsert < items.length) {
            for (Item i : items) {
                if (i.getId() == valueInsert) {
                    basket.add(new Item(i.getId(), i.getName(), i.getCategory(), i.getPrice()));
                    System.out.println(i.toString());
                }
            }
            valueInsert = Integer.parseInt(sc.nextLine());
        }
    }


    private static void PrintCategoryItems(Item[] items, Category category) {
        System.out.println();
        System.out.println("каталог товаров в категории: " + category);
        for (Item i : items) {
            if (i.getCategory() == category) {
                System.out.println(i.toString());
            }
        }
    }

    private static void PrintAllItems(Item[] items) {
        System.out.println();
        System.out.println("каталог всех товаров");
        for (Item i : items) {
            System.out.println(i.toString());
        }
    }
}
