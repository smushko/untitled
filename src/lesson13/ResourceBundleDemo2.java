package lesson13;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(Locale.getDefault().getDisplayCountry());
        printInfo(new Locale("", ""));
        printInfo(new Locale("en", "US"));
        printInfo(new Locale("uk", "UA"));
    }
    private static void printInfo(Locale current)
            throws UnsupportedEncodingException {

        ResourceBundle rb = ResourceBundle.getBundle("topic", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            //value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
        System.out.println();
    }
}
