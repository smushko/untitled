package homeworks.lesson12.task7;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport extends Report {
    public FullReport(Employee[] employees) {
        super(employees);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        printTitle(new Locale("ua", "UA"));
        generateReport(getEmployees());
    }

    private static void printTitle(Locale current)
            throws UnsupportedEncodingException {

        ResourceBundle rb = ResourceBundle.getBundle("title", current);
        System.out.println(rb.getString("topic1"));
    }
}

