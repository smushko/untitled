package homeworks.lesson10.task5market;

import java.util.Objects;

public class Item {
    private int id;
    private String name;
    private double price;
    private Category category;

    public Item(int id, String name, Category category, double price) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 &&
                id == item.id &&
                name.equals(item.name) &&
                category == item.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, id, category);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
