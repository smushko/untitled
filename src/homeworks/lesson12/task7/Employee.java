package homeworks.lesson12.task7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Employee {
    private String fullName;
    private double salary;
    private LocalDate salaryDate;

    public Employee(String fullname, double salary, LocalDate salaryDate) {
        this.fullName = fullname;
        this.salary = salary;
        this.salaryDate = salaryDate;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(LocalDate salaryDate) {
        this.salaryDate = salaryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullname(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(fullName, employee.fullName) &&
                Objects.equals(salaryDate, employee.salaryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, salaryDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullName + '\'' +
                ", salary=" + salary +
                ", salaryDate=" + salaryDate +
                '}';
    }


}
