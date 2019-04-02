package homeworks.lesson9.task5;

public class Circle {
    double radius;
    final double PI = 3.1415926535897932384626433832795;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return Double.compare(circle.PI, PI) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(PI);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getSquare(double radius) {
        return PI * radius * radius;
    }

    public double getLengthCircle(double radius) {
        return 2 * PI * radius;
    }
}
