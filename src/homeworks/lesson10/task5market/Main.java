package homeworks.lesson10.task5market;

import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    static NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) throws UnsupportedEncodingException {
        Item[] items = {new Item(1, "Сок", Category.DRINK, 25),
                new Item(2, "Вода", Category.DRINK, 12),
                new Item(3, "Хлеб", Category.FOOD, 15),
                new Item(4, "Масло", Category.FOOD, 35),
                new Item(5, "Футболка", Category.CLOTHIN, 100),
                new Item(6, "Штаны", Category.CLOTHIN, 150)};
        Scanner sc = new Scanner(System.in);

        ArrayList<Order> basket = new ArrayList<Order>();
        User user1 = getUser(sc);

        while (true) {
            System.out.printf("%nвыберите действие%n");
            System.out.println("1 - вывод списка товаров");
            System.out.println("2 - выбор товаров");
            System.out.println("3 - выбранные товары");
            System.out.println("4 - очистка корзины");
            System.out.println("5 - печать чека");
            System.out.println("6 - просмотр ника пользователя");


            int action = Integer.parseInt(sc.nextLine());

            switch (action) {
                case 1:
                    printAllItems(items);
                    break;
                case 2:
                    printAllItems(items);
                    insertItems(items, basket, user1);
                    break;
                case 3:
                    printSelectedItems(basket);
                    break;
                case 4:
                    basket.clear();
                    break;
                case 5:
                    printCheck(basket);
                    break;
                case 6:
                    System.out.printf("никнейм покупателя: %s%n%n",user1.getNickName());
                    break;
                default:
                    System.out.println();
            }
        }
    }

    private static void printCheck(ArrayList<Order> basket) throws UnsupportedEncodingException {
        Locale current = new Locale("ua", "UA");
        ResourceBundle rb = ResourceBundle.getBundle("attributes", current);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.printf("%s: %30s%n%n", rb.getString("topic1"), dateTime.format(formatter));
        System.out.printf("%-10s %-14s %10s%n", rb.getString("topic2"), rb.getString("topic3"), rb.getString("topic4"));
        System.out.printf("------------------------------------%n");
        double topalCost = 0;
        for (Order i : basket) {
            System.out.printf("%-10s %-14s %10s%n", i.getItem().getName(), i.getItem().getCategory(), currencyFormat.format(i.getItem().getPrice()));
            topalCost += i.getItem().getPrice();
        }
        System.out.printf("------------------------------------%n");
        System.out.printf("%-25s %10s%n%n", rb.getString("topic5"), currencyFormat.format(topalCost));
    }

    private static void printSelectedItems(ArrayList<Order> basket) {
        System.out.println("в корзину добавлены товары: ");
        for (Order i : basket) {
            System.out.println(i.toString());
        }
    }

    private static User getUser(Scanner sc) {
        System.out.println("введите логин");
        String a = sc.nextLine();
        System.out.println("введите пароль");
        return new User(a, sc.nextLine());
    }

    private static void insertItems(Item[] items, ArrayList<Order> basket, User user) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите ID товара от 1 до %s. 0 - закончить выбор%n", items.length);
        int valueInsert = Integer.parseInt(sc.nextLine());
        int counter = 0;
        while (valueInsert != 0 && valueInsert > 0 && valueInsert <= items.length) {
            for (Item i : items) {
                if (i.getId() == valueInsert) {
                    basket.add(new Order(counter++, user.getNickName(), i, LocalDateTime.now()));
                    System.out.println(i.toString());
                }
            }
            System.out.printf("Введите ID товара от 1 до %s. 0 - закончить выбор%n", items.length);
            valueInsert = Integer.parseInt(sc.nextLine());
        }
    }

    private static void printCategoryItems(Item[] items, Category category) {
        System.out.println();
        System.out.println("каталог товаров в категории: " + category);
        for (Item i : items) {
            if (i.getCategory() == category) {
                System.out.println(i.toString());
            }
        }
    }

    private static void printAllItems(Item[] items) {
        System.out.println();
        System.out.println("каталог всех товаров");
        for (Item i : items) {
            System.out.printf("ID: %-5s %-10s %-10s %10s%n", i.getId(), i.getName(), i.getCategory(), currencyFormat.format(i.getPrice()));
        }
    }
}
