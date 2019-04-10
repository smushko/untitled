package homeworks.lesson13.task4;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMMM yyyy");
        Celebrates[] celebrates = {new Celebrates(LocalDateTime.parse("1 января 2019", formatter1), "Новый год"),
                new Celebrates(LocalDateTime.parse("7 января 2019", formatter1), "Рождество Христово"),
                new Celebrates(LocalDateTime.parse("8 марта 2019", formatter1), "Международный женский день"),
                new Celebrates(LocalDateTime.parse("28 апреля 2019", formatter1), "Пасха"),
                new Celebrates(LocalDateTime.parse("1 мая 2019", formatter1), "День труда"),
                new Celebrates(LocalDateTime.parse("9 мая 2019", formatter1), "День Победы"),
                new Celebrates(LocalDateTime.parse("16 июня 2019", formatter1), "Троица"),
                new Celebrates(LocalDateTime.parse("28 июня 2019", formatter1), "День Конcтитуции Украины"),
                new Celebrates(LocalDateTime.parse("24 августа 2019", formatter1), "День незaвисимости Украины"),
                new Celebrates(LocalDateTime.parse("14 октября 2019", formatter1), "День защитника Украины"),
                new Celebrates(LocalDateTime.parse("25 декабря 2019", formatter1), "Рождество Христово")};



        for (Celebrates i : celebrates) {
            System.out.printf("%10s %25s%n", i.getDate().format(formatter1) , i.getCaption());
        }

    }
}
