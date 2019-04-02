package homeworks.lesson10.task4Atelier;

public class Skirt extends Clothing implements WomensClothing {
    public Skirt(int size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }

    @Override
    public void dressingWoman() {
        System.out.println(toString());
    }
}
