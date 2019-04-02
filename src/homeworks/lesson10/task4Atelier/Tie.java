package homeworks.lesson10.task4Atelier;

public class Tie extends Clothing implements MensClothing {
    public Tie(int size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }

    @Override
    public void dressingMan() {
        System.out.println(toString());
    }
}
