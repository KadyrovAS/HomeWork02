package src.courseProject;

import java.util.Objects;

public class Employee {
    static private int idCount;
    private String surname;
    private String name;
    private String middleName;
    private int id;
    private int departmentNumber;
    private int salary;

    public Employee(String surname, String name, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.id = idCount;
        idCount++;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getId() {
        return id;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", ФИО: " + surname + " " + name + " " + middleName +
                ", отдел: " + departmentNumber +
                ", зарплата=" + salary;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return surname.equals(employee.surname) &&
                name.equals(employee.name) &&
                middleName.equals(employee.middleName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(surname, name, middleName);
    }
}
