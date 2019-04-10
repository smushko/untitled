package homeworks.lesson12.task7;
/*
 Создать класс Employee, у которого есть переменные класса - fullname, salary.
 Создать массив содержащий несколько объектов этого типа. Создать класс Report,
 который будет содержать статический метод generateReport, в котором выводится
 информация о зарплате всех сотрудников. Используйте форматировании строк.
 Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака
 после запятой и можете добавить что-нибудь свое.
  */

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Report {
    //private static Employee[] employees;
    private static Employee[] employees = {new Employee("Иванов", 200, LocalDate.now()),
            new Employee("Сидоров", 210, LocalDate.now()),
            new Employee("Петров", 220, LocalDate.now()),
            new Employee("Васечкин", 230, LocalDate.now())};

    public Report(Employee[] employees) {
        Report.employees = employees;
    }

    public static Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
       

        generateReport(getEmployees());
    }

    public static void generateReport(Employee[] data) {
        for (Employee d : data) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            System.out.printf("Начиcлено:  %-10s  %5.2f %12s%n", d.getFullName(), d.getSalary(), d.getSalaryDate().format(formatter));
        }
    }
}
