package homeworks.lesson9.task6;

import java.util.Arrays;

public class Basket {
    Item[] soldItems;

    public Basket(Item[] soldItems) {
        this.soldItems = soldItems;
    }

    public Basket() {

    }

    public Item[] getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(Item[] soldItems) {
        this.soldItems = soldItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(soldItems, basket.soldItems);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(soldItems);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "soldItems=" + Arrays.toString(soldItems) +
                '}';
    }
}
