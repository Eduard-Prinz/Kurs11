import java.util.Arrays;
class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees[0] = new Employee("Лебедев Даниил", 1, 114_000);
        employees[1] = new Employee("Козлова Алина", 2, 133_000);
        employees[2] = new Employee("Волков Павел", 3, 114_000);
        employees[3] = new Employee("Морозова Юлия", 1, 35_500);
        employees[4] = new Employee("Николаев Артем", 2, 94_500);
        employees[5] = new Employee("Федорова Анастасия", 4, 101_000);
        employees[6] = new Employee("Васильев Алексей", 3, 89_000);
        employees[7] = new Employee("Соколов Максим", 5, 127_000);
        employees[8] = new Employee("Павлова София", 1, 110_000);
        employees[9] = new Employee("Кузьмин Егор", 2, 126_000);

        System.out.println("Список всех сотрудников:");

        printAllEmployees();

        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateTotalSalary());

        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary().getFullName());

        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary().getFullName());

        System.out.println("Среднее значение зарплат: " + calculateAverageSalary());

        System.out.println("Ф.И.О. всех сотрудников:");
        printAllEmployeeNames();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int numEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numEmployees++;
            }
        }
        return numEmployees >0 ? totalSalary/numEmployees : 0.0;
    }

    public static void printAllEmployeeNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}