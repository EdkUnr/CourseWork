import java.util.Objects;

public class Employee {
    private static int counter = 1;

    private int id;
    private double salary;
    private String name;
    private int department;

    public Employee(String name, double salary, int department) {
        this.id = counter++;
        this.name = name;
        this.department = department;
        this.salary = salary;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Сотрудник - " +
                " id:" + id +
                ", Имя:'" + name + '\'' +
                ", Отдел: " + department +
                ", Зарплата: " + salary;
    }
}
