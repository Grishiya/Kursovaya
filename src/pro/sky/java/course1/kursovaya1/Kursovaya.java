package pro.sky.java.course1.kursovaya1;

public class Kursovaya {
    private static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("Карасик Василий Вальеревич", 3, 80_000);
        employee[1] = new Employee("Гетшанбек Махмуж Урбекович", 2, 60_000);
        employee[2] = new Employee("Петров Алексей Юрьевич", 1, 120_000);
        employee[3] = new Employee("Александрова Александра Александровна", 4, 40_000);
        employee[4] = new Employee("Джонсов Джон Джонсович", 5, 35_000);
        employee[5] = new Employee("Спиридонов Алексей Лукьянович", 1, 125_000);
        employee[6] = new Employee("Удзумаки Наруто Минатович", 2, 60_000);
        employee[7] = new Employee("Петушков Игорь Михайлович", 3, 80_000);
        employee[8] = new Employee("Пистрякова Влада Олеговна", 4, 40_000);
        employee[9] = new Employee("Макконахов Макфлури Макнагетсович", 5, 30_000);
        printAllEmployee();
        System.out.println("Cамая низка зарплата у - " + searchEmployeeMinSalary().getFullName() + " = " + searchEmployeeMinSalary().getSalary());
        System.out.println("Самая большая зарплата у " + searchEmployeeMaxSalary().getFullName() + " = " + searchEmployeeMaxSalary().getSalary());
        System.out.println("Общая сумма зарплат сотрудников в месяц = " + calculateEmployeeSumSalary());
        System.out.println("Средняя зарплата в компании = " + calculateAverageSalary());
        printAllFullName();
        employee[6].setSalary(138_050);
        printAllEmployee();
        System.out.println("Самая большая зарплата у " + searchEmployeeMaxSalary().getFullName() + " = " + searchEmployeeMaxSalary().getSalary());
        System.out.println("Средняя зарплата в компании = " + calculateAverageSalary());
    }


    public static void printAllEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static double calculateEmployeeSumSalary() {
        double sum = 0;
        for (Employee employee1 : employee) {

            sum += employee1.getSalary();
        }
        return sum;

    }

    public static Employee searchEmployeeMinSalary() {
        Employee minSalary1 = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (minSalary1.getSalary() > employee[i].getSalary()) {
                minSalary1 = employee[i];
            }
        }
        return minSalary1;
    }

    public static Employee searchEmployeeMaxSalary() {
        Employee maxSalary1 = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary1.getSalary()) {
                maxSalary1 = employee[i];
            }
        }
        return maxSalary1;
    }

    public static double calculateAverageSalary() {
        return calculateEmployeeSumSalary() / employee.length;
    }


    public static void printAllFullName() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Вывожу только имя сотрудника : - " + employee[i].getFullName());


        }
    }
}

