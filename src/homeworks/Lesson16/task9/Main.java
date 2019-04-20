package homeworks.Lesson16.task9;
/*Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
Создать коллекцию, содержащую объекты класса Student. Написать метод, который удаляет студентов со
средним баллом <3. Если средний балл>=3, студент переводится на следующий курс.
Напишите метод printStudents(List<Student> students, int course), который получает
список студентов и номер курса и печатает на консоль имена тех студентов из списка,
которые обучаются на данном курсе.*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Student> studentsNextCourse = new ArrayList<>();
        students.add(new Student("Иванов", "G1", 3, new int[]{4, 1, 1, 2, 3}));
        students.add(new Student("Петров", "G1", 3, new int[]{5, 5, 4, 4, 4, 4, 2, 3}));
        students.add(new Student("Сидоров", "G1", 3, new int[]{4, 1, 2, 3}));
        students.add(new Student("Васечкин", "G1", 3, new int[]{4, 5, 2, 2, 1, 5, 4, 3, 4, 2, 3}));
        students.add(new Student("Васин", "G1", 3, new int[]{4, 5, 3, 5, 5, 4}));
        students.add(new Student("Петин", "G1", 3, new int[]{4, 5, 1, 4, 5, 3, 2, 6, 2, 3}));
        students.add(new Student("Седой", "G1", 3, new int[]{4, 5, 2, 5, 1, 2, 3, 5, 4, 2, 3}));


        students.forEach(i -> System.out.printf("Студент: %-10s группа: %s    cредний балл: %5.2f%n", i.getName(), i.getCourse(), i.getAverageRatings()));

        System.out.println("\nПереводятся на следующий курс:");
        students = getStudentsAverageScoreOver3(students);
        students.forEach(i -> System.out.printf("Студент: %-10s группа: %s    cредний балл: %5.2f%n", i.getName(), i.getCourse(), i.getAverageRatings()));

        System.out.println();
        printStudents(students, 3);

        System.out.println();
        printStudents(students, 4);

        Comparator<Student> studentComparator
                = Comparator.comparing(Student::getAverageRatings);
        Comparator<Student> studentComparatorReversed
                = studentComparator.reversed();
        Collections.sort(students, studentComparatorReversed);
/*
        Collections.sort(students, Comparator.comparing(Student::getAverageRatings));
        Comparator<Student> studentsReversed
                = students.reversed();*/

        /*students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAverageRatings() == o2.getAverageRatings()) return 0;
                else if (o1.getAverageRatings() > o2.getAverageRatings()) return 1;
                else return -1;
            }
        });*/
        System.out.println();
        students.forEach(i -> System.out.printf("Студент: %-10s группа: %s    cредний балл: %5.2f%n", i.getName(), i.getCourse(), i.getAverageRatings()));
    }

    static List<Student> getStudentsAverageScoreOver3(List<Student> students) {
        for (Student i : students) {
            if (i.getAverageRatings() >= 3) {
                i.setCourse(4);
            }
        }
        return students;
    }

    static void printStudents(List<Student> students, int course) {
        for (Student i : students) {
            if (i.getCourse() == course) {
                System.out.printf("Студент: %-10s группа: %s    cредний балл: %5.2f%n", i.getName(), i.getCourse(), i.getAverageRatings());
            }
        }

    }
}
