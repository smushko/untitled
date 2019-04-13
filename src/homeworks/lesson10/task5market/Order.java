package homeworks.lesson10.task5market;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Order {
    private int id;
    private String nickName; // ник покупателя
    private Item item;
    private LocalDateTime dateTime; //дата покупки

    public Order(int id, String nickName, Item item, LocalDateTime dateTime) {
        this.id = id;
        this.nickName = nickName;
        this.item = item;
        this.dateTime = dateTime;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                nickName.equals(order.nickName) &&
                item.equals(order.item) &&
                dateTime.equals(order.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickName, item, dateTime);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", item=" + item +
                ", dateTime=" + dateTime +
                '}';
    }
}
