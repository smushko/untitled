package homeworks.lesson10.task5market;

import java.util.Arrays;
import java.util.Objects;

public class Order {
    private int id;
    private String nickName;
    private Item[] basket;

    public Order(int id, String nickName, Item[] basket) {
        this.id = id;
        this.nickName = nickName;
        this.basket = basket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Item[] getBasket() {
        return basket;
    }

    public void setBasket(Item[] basket) {
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                nickName.equals(order.nickName) &&
                Arrays.equals(basket, order.basket);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, nickName);
        result = 31 * result + Arrays.hashCode(basket);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", basket=" + Arrays.toString(basket) +
                '}';
    }
}
