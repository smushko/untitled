package homeworks.lesson12.task7;
/*
 Создать класс Employee, у которого есть переменные класса - fullname, salary.
 Создать массив содержащий несколько объектов этого типа. Создать класс Report,
 который будет содержать статический метод generateReport, в котором выводится
 информация о зарплате всех сотрудников. Используйте форматировании строк.
 Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака
 после запятой и можете добавить что-нибудь свое.
  */

public class Report {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Иванов", 200),
                new Employee("Сидоров", 210),
                new Employee("Петров", 220),
                new Employee("Васечкин", 230)};

        generateReport(employees);
    }

    static void generateReport(Employee[] data) {
        for (Employee d : data) {
            System.out.printf("Начиcлено:  %-10s  %5.2f%n", d.fullname, d.salary);
        }
    }

}
