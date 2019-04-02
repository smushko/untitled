package homeworks.lesson9.task5;

public class Main {
    static int lengthArray = 8;
    static Circle[] circles = new Circle[lengthArray];

    public static void main(String[] args) {
        for (int i = 0; i < lengthArray; i++) {
            double a = Math.random() * lengthArray;
            circles[i] = new Circle((int) a);
            System.out.println((int) a);
        }

        for (Circle circle : circles) {
            System.out.print("R = " + circle.radius + "; ");
            System.out.print("S = " + circle.getSquare(circle.radius) + "; ");
            System.out.println("L = " + circle.getLengthCircle(circle.radius));
        }
    }
}
