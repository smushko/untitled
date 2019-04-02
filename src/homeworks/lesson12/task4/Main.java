package homeworks.lesson12.task4;

public class Main {
    public static void main(String[] args) {
        String[] str = {"string", "code", "Practice"};
        for (String s : str) {
            System.out.println(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));
        }
    }
}
