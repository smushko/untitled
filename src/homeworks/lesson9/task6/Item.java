package homeworks.lesson9.task6;

public class Item {
    //имя, цена, рейтинг.
    String nameItem;
    double priceItem;
    int rateItem;

    public Item(String nameItem, double priceItem, int rateItem) {
        this.nameItem = nameItem;
        this.priceItem = priceItem;
        this.rateItem = rateItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    public int getRateItem() {
        return rateItem;
    }

    public void setRateItem(int rateItem) {
        this.rateItem = rateItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (Double.compare(item.priceItem, priceItem) != 0) return false;
        if (rateItem != item.rateItem) return false;
        return nameItem.equals(item.nameItem);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nameItem.hashCode();
        temp = Double.doubleToLongBits(priceItem);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + rateItem;
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nameItem=" + nameItem +
                ", priceItem=" + priceItem +
                ", rateItem=" + rateItem +
                '}';
    }
}
