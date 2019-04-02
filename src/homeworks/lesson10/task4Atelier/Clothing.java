package homeworks.lesson10.task4Atelier;

import java.util.Objects;

public abstract class Clothing {
    //размер одежды, стоимость, цвет.
    private int size;
    private double cost;
    private String color;

    public Clothing(int size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothing clothing = (Clothing) o;
        return size == clothing.size &&
                Double.compare(clothing.cost, cost) == 0 &&
                color.equals(clothing.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, cost, color);
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
