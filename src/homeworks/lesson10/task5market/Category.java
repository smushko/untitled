package homeworks.lesson10.task5market;

public enum Category {
    CLOTHIN(1), DRINK(2), FOOD(3);
    private int i;

    Category(int i) {
        this.i = i;
    }

    public int getCategory() {
        return i;
    }

    public void setCategory(int category) {
        this.i = category;
    }
}
