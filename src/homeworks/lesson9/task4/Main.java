package homeworks.lesson9.task4;

public class Main {

    public static void main(String[] args) {
        Apriсot apriсot1 = new Apriсot(3, 10);
        Apriсot apriсot2 = new Apriсot(2, 15);
        Apple apple1 = new Apple(3, 20);
        Apple apple2 = new Apple(2, 25);
        Pear pear1 = new Pear(3, 30);
        Pear pear2 = new Pear(2, 35);
        double overallCost = 0;

        Fruit[] fruits = {apriсot1, apriсot2, apple1, apple2, pear1, pear2};

        for (Fruit fruit : fruits) {
            overallCost += fruit.getCostFruit();
        }
        System.out.println("Общая стоимость фруктов: " + overallCost);

        Apriсot.printOverallApricotCost(fruits);

        Apple.printOverallAppleCost(fruits);

        Pear.printOverallPearCost(fruits);

        Fruit.printManufacturerInfo();
    }
}
