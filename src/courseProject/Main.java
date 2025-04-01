package courseProject;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);

        employeeBook.addEmployee(new Employee("Иванов", "Сергей", "Петрович",
                1, 60_000));
        employeeBook.addEmployee(new Employee("Григорьев", "Андрей", "Викторович",
                1, 70_000));
        employeeBook.addEmployee(new Employee("Семенов", "Игорь", "Степанович",
                2, 80_000));
        employeeBook.addEmployee(new Employee("Петров", "Виктор", "Иванович",
                2, 90_000));
        employeeBook.addEmployee(new Employee("Смирнов", "Илья", "Георгиевич",
                3, 100_000));
        employeeBook.addEmployee(new Employee("Сидоров", "Семен", "Сергеевич",
                3, 110_000));
        employeeBook.addEmployee(new Employee("Козлов", "Алексей", "Павлович",
                4, 120_000));
        employeeBook.addEmployee(new Employee("Романов", "Владимир", "Андреевич",
                4, 130_000));
        employeeBook.addEmployee(new Employee("Кузнецов", "Александр", "Игоревич",
                5, 140_000));
        employeeBook.addEmployee(new Employee("Серебров", "Петр", "Вячеславович",
                5, 150_000));


        System.out.println("Список всех сотрудников:");
        System.out.println(employeeBook);
        employeeBook.increaseSalaryByInterest(5, 0);
        System.out.println("Список всех сотрудников после увеличения з/п на 5%:");
        System.out.println(employeeBook);
        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(employeeBook.getEmployeeWithMinimumSalary(0));
        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(employeeBook.getEmployeeWithMaximumSalary(0));
        System.out.println("Общая сумма на зарплату в месяц (рублей): " + employeeBook.getTotalSalary(0));
        System.out.println("Средняя зарплата (рублей): " + employeeBook.getAverageSalary(0));
        System.out.println("Список сотрудников с зарплатой больше 140 000 рублей:");
        System.out.println(employeeBook.getListOfEmployeesWithHigherSalary(140_000, 0));
        System.out.println("Список сотрудников с зарплатой меньше 80 000 рублей:");
        System.out.println(employeeBook.getListOfEmployeesWithLowerSalary(80_000, 0));

        System.out.println("-".repeat(50));
        for (int i = 1; i <= 5; i++) {
            System.out.println("Список сотрудников отдела №" + i + ":");
            System.out.println(employeeBook.getListOfDepartmentEmployees(i));
            System.out.println("Сотрудник отдела №" + i + " с минимальной з/п:");
            System.out.println(employeeBook.getEmployeeWithMinimumSalary(i));
            System.out.println("Сотрудник отдела №" + i + " с максимальной з/п:");
            System.out.println(employeeBook.getEmployeeWithMaximumSalary(i));
            System.out.println("Общая сумма на зарплату в отделе №" + i +
                    " в месяц (рублей): " + employeeBook.getTotalSalary(i));
            System.out.println("Средняя зарплата (рублей) в отделе №" + i + ": " +
                    employeeBook.getAverageSalary(i));
            System.out.println("Список сотрудников отдела №" + i +
                    " с зарплатой больше 140 000 рублей:");
            System.out.println(employeeBook.getListOfEmployeesWithHigherSalary(140_000, i));
            System.out.println("Список сотрудников отдела №" + i +
                    " с зарплатой меньше 80 000 рублей:");
            System.out.println(employeeBook.getListOfEmployeesWithLowerSalary(80_000, i));


            System.out.println(".".repeat(50));
        }
        employeeBook.deleteEmployee(1);
        System.out.println("Список сотрудников отдела №1 после удаления:");
        System.out.println(employeeBook.getListOfDepartmentEmployees(1));

        //увеличить з/п сотрудникам отдела №2 на 5%
        employeeBook.increaseSalaryByInterest(5, 2);
        System.out.println(employeeBook.getListOfDepartmentEmployees(2));
    }
}
