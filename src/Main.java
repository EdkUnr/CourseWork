public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 43000.0,1);
        employees[1] = new Employee("Иванов Иван Евгеньевич", 44000.0,1);
        employees[2] = new Employee("Петров Игорь Валерьевич", 45000.0,2);
        employees[3] = new Employee("Злыгостеев Александр Иванович", 46000.0,2);
        employees[4] = new Employee("Кипнов Петр Александрович", 47000.0,3);
        employees[5] = new Employee("Иванов Артём Артёмович", 48000.0,3);
        employees[6] = new Employee("Сидоров Григорий Гоергиевич", 49000.0,4);
        employees[7] = new Employee("Тарасенко Виталий Иванович", 50000.0,4);
        employees[8] = new Employee("Наширин Иван Яковлевич", 51000.0,5);
        employees[9] = new Employee("Залысов Михаил Николаевич", 52000.0,5);


        EmployeeUtils.printAllEmployees(employees);
        double totalSalaries = EmployeeUtils.calculateTotalSalaries(employees);
        Employee minSalaryEmp = EmployeeUtils.findEmployeeWithMinSalary(employees);
        Employee maxSalaryEmp = EmployeeUtils.findEmployeeWithMaxSalary(employees);
        double averageSalary = EmployeeUtils.calculateAverageSalary(employees);
        EmployeeUtils.printEmployeeNames(employees);

        // Вывод результатов
        System.out.println("Общая сумма зарплат: " + totalSalaries);
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmp);
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmp);
        System.out.println("Средняя зарплата: " + averageSalary);
    }
}