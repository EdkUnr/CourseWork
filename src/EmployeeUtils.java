public class EmployeeUtils {
    public static void printAllEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
    }

    public static double calculateTotalSalaries(Employee[] employees) {
        double total = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                total += emp.getSalary();
            }
        }
        return total;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee minSalaryEmployee = null;
        for (Employee emp : employees) {
            if (emp != null && (minSalaryEmployee == null || emp.getSalary() < minSalaryEmployee.getSalary())) {
                minSalaryEmployee = emp;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = null;
        for (Employee emp : employees) {
            if (emp != null && (maxSalaryEmployee == null || emp.getSalary() > maxSalaryEmployee.getSalary())) {
                maxSalaryEmployee = emp;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double total = 0;
        int count = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                total += emp.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public static void printEmployeeNames(Employee[] employees) {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.getName());
            }
        }
    }
}

