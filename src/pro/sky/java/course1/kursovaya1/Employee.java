package pro.sky.java.course1.kursovaya1;



public class Employee {
    private final int id;
    private static int counterId = 1;
    private String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counterId++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getId() {
        return counterId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return id + ". Ф.И.О. сотрудника - " + getFullName() + ". Работает в отделе " + getDepartment() + ". Зарплата - " + getSalary() + ".";
    }

}




