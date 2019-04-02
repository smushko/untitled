package homeworks.lesson9.task6;

import java.util.Arrays;

public class Category {
    // имя и массив товаров.
    String nameCategory;
    Item[] itemsOnCategory;

    public Category(String nameCategory, Item[] itemsOnCategory) {
        this.nameCategory = nameCategory;
        this.itemsOnCategory = itemsOnCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Item[] getItemsOnCategory() {
        return itemsOnCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (!nameCategory.equals(category.nameCategory)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(itemsOnCategory, category.itemsOnCategory);
    }

    @Override
    public int hashCode() {
        int result = nameCategory.hashCode();
        result = 31 * result + Arrays.hashCode(itemsOnCategory);
        return result;
    }

    public void setItemsOnCategory(Item[] itemsOnCategory) {
        this.itemsOnCategory = itemsOnCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "nameCategory='" + nameCategory + '\'' +
                ", itemsOnCategory=" + Arrays.toString(itemsOnCategory) +
                '}';
    }
}
