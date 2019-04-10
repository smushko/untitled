package homeworks.lesson13.task4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Celebrates {
    private LocalDateTime date;
    private String caption;

    public Celebrates(LocalDateTime date, String caption) {
        this.date = date;
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Celebrates that = (Celebrates) o;
        return date.equals(that.date) &&
                caption.equals(that.caption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, caption);
    }

    @Override
    public String toString() {
        return "Celebrates{" +
                "date=" + date +
                ", caption='" + caption + '\'' +
                '}';
    }
}