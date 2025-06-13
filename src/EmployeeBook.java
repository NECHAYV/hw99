public class EmployeeBook {
    private Employee[] employees;
    private int size;

    public EmployeeBook(int capacity) {
        this.employees = new Employee[capacity];
        this.size = 0;
    }


    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public double calculateTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;

        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;

        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double calculateAverageSalary() {
        int count = 0;
        double total = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }

    public void printFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }


    public void indexSalaries(double percentage) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() * (1 + percentage / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public Employee findEmployeeWithMinSalaryInDepartment(int department) {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee findEmployeeWithMaxSalaryInDepartment(int department) {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double calculateTotalSalaryForDepartment(int department) {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public double calculateAverageSalaryForDepartment(int department) {
        int count = 0;
        double total = 0;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                total += employee.getSalary();
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }

    public void indexSalariesForDepartment(int department, double percentage) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                double newSalary = employee.getSalary() * (1 + percentage / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public void printEmployeesFromDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("ID: " + employee.getId() +
                        ", FullName: " + employee.getFullName() +
                        ", Salary: " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryLessThan(double threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < threshold) {
                System.out.println("ID: " + employee.getId() +
                        ", FullName: " + employee.getFullName() +
                        ", Salary: " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryGreaterOrEqualThan(double threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= threshold) {
                System.out.println("ID: " + employee.getId() +
                        ", FullName: " + employee.getFullName() +
                        ", Salary: " + employee.getSalary());
            }
        }
    }


    public boolean addEmployee(String fullName, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(fullName, department, salary);
                size++;
                return true;
            }
        }
        return false;
    }

    public boolean removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}



