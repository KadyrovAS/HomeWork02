package src.courseProject;

public class EmployeeBook {
    private static int employeeCount; //индекс сотрудника в базе
    private final int defaultNumberOfEmployees = 10; //количество сотрудников в базе по умолчанию
    private Employee[] employees;

    public EmployeeBook(int n) {
        n = n <= 0 ? defaultNumberOfEmployees : n;
        this.employees = new Employee[n];
    }

    public EmployeeBook() {
        this.employees = new Employee[defaultNumberOfEmployees];
    }

    //добавление нового сотрудника в базу
    public boolean addEmployee(Employee employee) {
        return addEmployee(employee, employee.getDepartmentNumber(), employee.getSalary());
    }

    public boolean addEmployee(Employee employee, int departmentNumber, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                employee.setDepartmentNumber(departmentNumber);
                employee.setSalary(salary);
                return true;
            }
        }
        return false;
    }

    //Выбор из базы сотрудника с заданным id
    public Employee getEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }


    //Удаление сотрудника из базы с заданным id
    public boolean deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }


    //Выбор сотрудника из базы с минимальной з/п
    public Employee getEmployeeWithMinimumSalary() {
        return getEmployeeWithMinimumSalary(0);
    }


    public Employee getEmployeeWithMinimumSalary(int departmentNumber) {
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee == null || (departmentNumber != 0 &&
                    departmentNumber != employee.getDepartmentNumber())) {
                continue;
            }
            if (tempEmployee == null || employee.getSalary() < tempEmployee.getSalary()) {
                tempEmployee = employee;
            }
        }
        return tempEmployee;
    }


    //Выбор сотрудника из базы с максимальной з/п
    public Employee getEmployeeWithMaximumSalary() {
        return getEmployeeWithMaximumSalary(0);
    }

    public Employee getEmployeeWithMaximumSalary(int departmentNumber) {
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee == null || (departmentNumber != 0 &&
                    departmentNumber != employee.getDepartmentNumber())) {
                continue;
            }
            if (tempEmployee == null || employee.getSalary() > tempEmployee.getSalary()) {
                tempEmployee = employee;
            }
        }
        return tempEmployee;
    }

    //Возвращает среднюю з/п
    public double getAverageSalary() {
        return getAverageSalary(0);
    }

    public double getAverageSalary(int departmentNumber) {
        int countEmployees = 0;
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee == null || (departmentNumber != 0 &&
                    departmentNumber != employee.getDepartmentNumber())) {
                continue;
            }
            countEmployees++;
            totalSalary += employee.getSalary();
        }
        if (countEmployees == 0) {
            return 0;
        }
        return (double) totalSalary / countEmployees;
    }


    //Общая сумма затрат на з/п
    public int getTotalSalary() {
        return getTotalSalary(0);
    }

    public int getTotalSalary(int departmentNumber) {
        int total = 0;
        for (Employee employee : employees) {
            if (employee == null || (departmentNumber != 0 &&
                    departmentNumber != employee.getDepartmentNumber())) {
                continue;
            }
            total += employee.getSalary();
        }
        return total;
    }


    //Список сотрудников отдела с заданным номером
    public EmployeeBook getListOfDepartmentEmployees(int departmentNumber) {
        EmployeeBook employeeBook = new EmployeeBook();
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            if (employee.getDepartmentNumber() == departmentNumber) {
                employeeBook.addEmployee(employee);
            }
        }
        return employeeBook;
    }

    //Увеличение з/п на заданный процент
    public void increaseSalaryByInterest(int percentage) {
        increaseSalaryByInterest(percentage, 0);
    }

    public void increaseSalaryByInterest(int percentage, int departmentNumber) {
        int salary;
        for (Employee employee : employees) {
            if (employee == null || (departmentNumber != 0 &&
                    employee.getDepartmentNumber() != departmentNumber)) {
                continue;
            }
            salary = employee.getSalary() + employee.getSalary() * percentage / 100;
            employee.setSalary(salary);
        }
    }

    //Получение списка работников с з/п больше заданной
    public EmployeeBook getListOfEmployeesWithHigherSalary(int salary) {
        return getListOfEmployeesWithHigherSalary(salary, 0);
    }


    public EmployeeBook getListOfEmployeesWithHigherSalary(int salary, int departmentNumber) {
        EmployeeBook employeeBook = new EmployeeBook();
        for (Employee employee : employees) {
            if (employee == null || (departmentNumber != 0 &&
                    departmentNumber != employee.getDepartmentNumber())) {
                continue;
            }
            if (employee.getSalary() > salary) {
                employeeBook.addEmployee(employee);
            }
        }
        return employeeBook;
    }


    //Получение списка работников с зарплатой меньше заданной
    public EmployeeBook getListOfEmployeesWithLowerSalary(int salary) {
        return getListOfEmployeesWithLowerSalary(salary, 0);
    }


    public EmployeeBook getListOfEmployeesWithLowerSalary(int salary, int departmentNumber) {
        EmployeeBook employeeBook = new EmployeeBook();
        for (Employee employee : employees) {
            if (employee == null || (departmentNumber != 0 &&
                    departmentNumber != employee.getDepartmentNumber())) {
                continue;
            }
            if (employee.getSalary() < salary) {
                employeeBook.addEmployee(employee);
            }
        }
        return employeeBook;
    }


    @Override
    public String toString() {
        String line = "";
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            line += "id = " + employee.getId() + ". " +
                    employee.getSurname() + " " +
                    employee.getName() + " " +
                    employee.getMiddleName() + ", " +
                    "зарплата = " + employee.getSalary() +
                    ";" + "\n";
        }
        return line;
    }
}
