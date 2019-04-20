package homeworks.Lesson16.task9;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name, group;
    private int course;
    private int[] ratings;

    public Student(String name, String group, int course, int[] ratings) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getRatings() {
        return ratings;
    }

    public void setRatings(int[] ratings) {
        this.ratings = ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                name.equals(student.name) &&
                group.equals(student.group) &&
                Arrays.equals(ratings, student.ratings);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, group, course);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", ratings=" + Arrays.toString(ratings) +
                '}';
    }

    public Double getAverageRatings() {
        double average = 0;
        for (double i : ratings) {
            average += i;
        }
        return average/ratings.length;
    }
}
