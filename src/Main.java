public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addEmployee("Иванов Иван Иванович", 1, 50000);
        employeeBook.addEmployee("Петров Петр Петрович", 2, 60000);
        employeeBook.addEmployee("Сидорова Анна Владимировна", 1, 55000);
        employeeBook.addEmployee("Кузнецов Дмитрий Сергеевич", 3, 75000);
        employeeBook.addEmployee("Смирнова Ольга Николаевна", 2, 45000);


        System.out.println("Все сотрудники:");
        employeeBook.printAllEmployees();

        System.out.println("\nОбщие затраты на зарплаты: " + employeeBook.calculateTotalSalary());

        System.out.println("\nСотрудник с минимальной зарплатой: " + employeeBook.findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.findEmployeeWithMaxSalary());

        System.out.println("\nСредняя зарплата: " + employeeBook.calculateAverageSalary());

        System.out.println("\nФИО всех сотрудников:");
        employeeBook.printFullNames();


        System.out.println("\nИндексация зарплат на 10%:");
        employeeBook.indexSalaries(10);
        employeeBook.printAllEmployees();

        System.out.println("\nСотрудник с минимальной зарплатой в отделе 1: " +
                employeeBook.findEmployeeWithMinSalaryInDepartment(1));

        System.out.println("Сотрудник с максимальной зарплатой в отделе 2: " +
                employeeBook.findEmployeeWithMaxSalaryInDepartment(2));

        System.out.println("\nСумма затрат на зарплаты по отделу 1: " +
                employeeBook.calculateTotalSalaryForDepartment(1));

        System.out.println("Средняя зарплата по отделу 2: " +
                employeeBook.calculateAverageSalaryForDepartment(2));

        System.out.println("\nИндексация зарплат в отделе 3 на 5%:");
        employeeBook.indexSalariesForDepartment(3, 5);
        employeeBook.printAllEmployees();

        System.out.println("\nСотрудники отдела 2:");
        employeeBook.printEmployeesFromDepartment(2);

        System.out.println("\nСотрудники с зарплатой меньше 60000:");
        employeeBook.printEmployeesWithSalaryLessThan(60000);

        System.out.println("\nСотрудники с зарплатой больше или равной 60000:");
        employeeBook.printEmployeesWithSalaryGreaterOrEqualThan(60000);

        // Тестируем методы управления массивом
        System.out.println("\nДобавляем нового сотрудника:");
        boolean added = employeeBook.addEmployee("Новиков Алексей Дмитриевич", 4, 80000);
        System.out.println("Добавлен: " + added);
        employeeBook.printAllEmployees();

        System.out.println("\nУдаляем сотрудника с ID=2:");
        boolean removed = employeeBook.removeEmployee(2);
        System.out.println("Удален: " + removed);
        employeeBook.printAllEmployees();

        System.out.println("\nПолучаем сотрудника с ID=3:");
        Employee employee = employeeBook.getEmployeeById(3);
        System.out.println(employee);
    }
}