package courseProject;

public class EmployeeBook {
    private final int defaultNumberOfEmployees = 10;
    private final Employee[] employees;

    public EmployeeBook(int n) {
        n = n <= 0 ? defaultNumberOfEmployees : n;
        this.employees = new Employee[n];
    }

    public EmployeeBook() {
        this.employees = new Employee[defaultNumberOfEmployees];
    }

    /**
     * Добавление нового сотрудника в базу данных
     *
     * @param employee
     * @return
     */

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    /**
     * Выбор сотрудника из базы данных с заданным id
     *
     * @param id
     * @return
     */
    public Employee getEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }


    /**
     * Удаление сотрудника из базы с заданным id
     *
     * @param id
     * @return
     */

    public boolean deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }


    /**
     * Выбор сотрудника с наименьшей з/п в отделе departmentNumber
     * Если departmentNumber == 0, то возвращается сотрудник с наименьшей з/п во всей базе данных
     *
     * @param departmentNumber
     * @return
     */
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

    /**
     * Выбор сотрудника с наибольшей з/п в отделе departmentNumber
     * Если departmentNumber == 0, то возвращается сотрудник с наибольшей з/п во всей базе данных
     *
     * @param departmentNumber
     * @return
     */
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


    /**
     * Возвращает среднюю з/п в отделе departmentNumber
     * Если departmentNumber == 0, то возвращает среднюю з/п по всей базе данных
     *
     * @param departmentNumber
     * @return
     */
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


    /**
     * Общая сумма на з/п в месяц для отдела departmentNumber
     * Если departmentNumber == 0, то возвращается общая сумма на з/п во всей базе данных
     *
     * @param departmentNumber
     * @return
     */
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


    /**
     * Возвращает список сотрудников отдела с заданным номером
     *
     * @param departmentNumber
     * @return
     */
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


    /**
     * Увеличение з/п на заданный процент сотрудникам в отделе departmentNumber
     * Если departmentNumber == 0, то з/п увеличивается всем сотрудникам на заданный процент
     *
     * @param percentage
     * @param departmentNumber
     */
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


    /**
     * Получение списка работников отдела departmentNumber с з/п больше заданной
     * Если departmentNumber == 0, то возвращается список работников с з/п больше заданной из всей базы данных
     *
     * @param salary
     * @param departmentNumber
     * @return
     */
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


    /**
     * Получение списка работников отдела departmentNumber с з/п меньше заданной
     * Если departmentNumber == 0, то возвращается список работников с з/п меньше заданной из всей базы данных
     *
     * @param salary
     * @param departmentNumber
     * @return
     */
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
