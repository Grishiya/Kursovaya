package pro.sky.java.course1.kursovaya1;

public class Kursovaya {
    private static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("Карасик Василий Вальеревич", 3, 80000);
        employee[1] = new Employee("Гетшанбек Махмуж Урбекович", 2, 60000);
        employee[2] = new Employee("Петров Алексей Юрьевич", 1, 120000);
        employee[3] = new Employee("Александрова Александра Александровна", 4, 40000);
        employee[4] = new Employee("Джонсов Джон Джонсович", 5, 35000);
        employee[5] = new Employee("Спиридонов Алексей Лукьянович", 1, 125000);
        employee[6] = new Employee("Удзумаки Наруто Минатович", 2, 60000);
        employee[7] = new Employee("Петушков Игорь Михайлович", 3, 80000);
        employee[8] = new Employee("Пистрякова Влада Олеговна", 4, 40000);
        employee[9] = new Employee("Макконахов Макфлури Макнагетсович", 5, 30000);
        allEmployee();
        sumSalary();
        minSalary();
        maxSalary();
        mediumSalary();
        {
            allFullName();
        }
    }

    public static void allEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public static void sumSalary() {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("Общая сумма зарплат сотрудников в месяц = " + sum);
    }

    public static void minSalary() {
        Employee minSalary = employee[0];
        int minSalary1 = minSalary.getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (minSalary1 > employee[i].getSalary()) {
                minSalary = employee[i];
            }
        }
        System.out.println("Самая низкая зарплата у " + minSalary.getFullName() + " = " + minSalary.getSalary());
    }

    public static void maxSalary() {
        Employee maxSalary1 = employee[0];//.getSalary();
        int maxSalary = maxSalary1.getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (maxSalary < employee[i].getSalary()) {
                maxSalary = employee[i].getSalary();
                maxSalary1 = employee[i];//.getSalary();

            }
        }
        System.out.println("Самая большая зарплата у " + maxSalary1.getFullName() + " = " + maxSalary1.getSalary());
    }

    public static void mediumSalary() {
        int sum = 0;
        int medium = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
            medium = sum / employee.length;
        }
        System.out.println("Средняя зарплата в компании " + medium);
    }

    public static void allFullName() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Вывожу только имя сотрудника : - " + employee[i].getFullName());


        }
    }
}

