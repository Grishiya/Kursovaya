package pro.sky.java.course1.kursovaya1;



public class Employee {
    private final int id;
    private static int counterId = 1;
    private final String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
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

    public double getSalary() {
        return salary;
    }

    public static int getId() {
        return counterId;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return id + ". Ф.И.О. сотрудника - " + getFullName() + ". Работает в отделе " + getDepartment() + ". Зарплата - " + getSalary() + ".";
    }

}




