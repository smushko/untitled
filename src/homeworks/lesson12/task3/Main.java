package homeworks.lesson12.task3;

public class Main {
    public static void main(String[] args) {
        String str = "Object-oriented programming is a programming language model organized" +
                " around objects rather than \"actions\" and data rather than logic." +
                " Object-oriented programming blabla. Object-oriented programming bla.";
        String subStr = "Object-oriented programming";


        System.out.println("исходник");
        System.out.println(str);

        if (str.indexOf(subStr) >= 0) {
            int counter = 1;
            boolean done = false;
            String tempStr = "";
            while (!done) {
                if (counter % 2 == 0) {
                    tempStr = tempStr.concat((str.substring(0, str.indexOf(subStr) + subStr.length())).replace(subStr, "OOP"));
                } else {
                    tempStr = tempStr.concat(str.substring(0, str.indexOf(subStr) + subStr.length()));
                }
                counter++;
                str = str.substring(str.indexOf(subStr) + subStr.length());
                if (str.indexOf(subStr) < 0) {
                    str = tempStr.concat(str);
                    done = true;
                }
            }
        } else {
            System.out.println("совпадений не найдено");
        }
        System.out.println("результат");
        System.out.println(str);
    }
}

