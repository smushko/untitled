package homeworks.lesson9.task4;

public class Apriсot extends Fruit {
    public double cost;

    public Apriсot(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Apriсot apriсot = (Apriсot) o;

        return Double.compare(apriсot.cost, cost) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Apriсot{" +
                "cost=" + cost +
                '}';
    }

    @Override
    public double getCostFruit() {
        return cost * weight;
    }

    public static void printOverallApricotCost(Fruit[] fruits) {
        double tmp = 0;
        System.out.println("метод вывода общей стоимости абрикос");
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apriсot) {
                tmp += fruit.getCostFruit();
            }
        }
        System.out.println(tmp);
    }
}
