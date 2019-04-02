package homeworks.lesson10.task4Atelier;

public class Pants extends Clothing implements MensClothing, WomensClothing {
    public Pants(int size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Pants{} " + super.toString();
    }

    @Override
    public void dressingMan() {
        System.out.println(toString());
    }

    @Override
    public void dressingWoman() {
        System.out.println(toString());
    }
}