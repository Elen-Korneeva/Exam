import java.util.Arrays;

public class Main {

    private static Employee_1[] employee1s = new Employee_1[10];

    public static void main(String[] args) {
        System.out.println("Hello world!");


        employee1s[0] = new Employee_1("Иванов", "Иван", "Иванович", 1, 85_000);
        employee1s[1] = new Employee_1("Сидоров", "Георгий", "Сергеевич", 2, 72_000);
        employee1s[2] = new Employee_1("Петров", "Петр", "Петрович", 3, 94_000);
        employee1s[3] = new Employee_1("Коробков", "Сергей", "Васильевич", 4, 88_000);
        employee1s[4] = new Employee_1("Оганнесян", "Сирануш", "Ваняевна", 5, 120_000);
        employee1s[5] = new Employee_1("Манукян", "Грач", "Геворгович", 1, 109_000);
        employee1s[6] = new Employee_1("Каширина", "Ольга", "Борисовна", 2, 57_000);
        employee1s[7] = new Employee_1("Пересильд", "Анна", "Николаевна", 3, 66_000);
        employee1s[8] = new Employee_1("Козловский", "Даниил", "Федорович", 4, 60_000);
        employee1s[9] = new Employee_1("Морозова", "Кристина", "Филипповна", 5, 76_000);

        all();

        System.out.println(getSumSalaryPerMonth());
        System.out.println(getMinSalary());
        System.out.println(getMaxSalary());
        System.out.println(getAverageSalary());
        aVoid();

        int departmentNumber = 2;
        getIndexSalary();

        System.out.print("\nСотрудник с минимальной зарплатой в отделе № " + departmentNumber + " - " + getMinDepartmentSalary(2));
        System.out.print(" ");

        System.out.println("\nСотрудник с максимальной зарплатой в отделе № "+ departmentNumber +" - " + getMaxDepartmentSalary(2));
        System.out.println(" ");

        System.out.printf("\nСумма затрат на зарплаты в месяц: в отделе № " + departmentNumber + " - %.2f рублей.", getSumSalaryDepartmentPerMonth(departmentNumber));
        System.out.println(" ");
        System.out.println(" ");

        System.out.printf("\nСреднее значение зарплат: в отделе № " + departmentNumber +" - %.2f рублей.", getAverageSalaryDepartment(departmentNumber));
        System.out.println(" ");
        System.out.println(" ");

        getIndexSalaryDepartment(departmentNumber);
        System.out.println(" ");
        System.out.println(" ");

        getAllEmployeesDepartment(departmentNumber);
        System.out.println(" ");

        double EmployeesSalary = 30000.00d;
        getAllEmployeesSalaryMin(EmployeesSalary);
        System.out.println(" ");

        getAllEmployeesSalaryMax(EmployeesSalary);

    }

    private static void all() {
        for (Employee_1 emp : employee1s) {
            System.out.println(emp);
        }
    }

    public static Employee_1 getMinSalary() {
        double min = 0;
        int index = 0;

        for (int i = 0; i < employee1s.length; i++) {
            if (employee1s[i] != null) {
                min = employee1s[i].getSalary();
                index = i;
                break;
            }
        }
        Employee_1 minSalary = employee1s[index];
        for (int i = index; i < employee1s.length; i++) {
            if (employee1s[i] == null) continue;
            if (employee1s[i].getSalary() < min) {
                min = employee1s[i].getSalary();
                minSalary = employee1s[i];
            }
        }
        return minSalary;
    }

    public static double getSumSalaryPerMonth() {
        double sum = 0;
        for (Employee_1 employee1 : employee1s) {
            if (employee1 == null) continue;
            sum += employee1.getSalary();
        }
        return sum;
    }

    public static Employee_1 getMaxSalary() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < employee1s.length; i++) {
            if (employee1s[i] != null) {
                max = employee1s[i].getSalary();
                index = i;
                break;
            }
        }
        Employee_1 maxSalary = employee1s[index];
        for (int i = index; i < employee1s.length; i++) {
            if (employee1s[i] == null) continue;
            if (employee1s[i].getSalary() > max) {
                max = employee1s[i].getSalary();
                maxSalary = employee1s[i];
            }
        }
        return maxSalary;
    }

    public static double getAverageSalary() {
        double sum = getSumSalaryPerMonth();
        int count = countEmployee_1();
        return sum / count;
    }

    public static int countEmployee_1() {
        int count = 0;
        for (Employee_1 emp : employee1s) {
            if (emp != null) {
                count++;
            }
        }
        return count;
    }

    public static void aVoid() {
        for (Employee_1 employee1 : employee1s) {
            System.out.println(employee1.getPullName());
        }//Повышенная сложность


    }

    public static void getIndexSalary() {
        int arg = 10;
        for (Employee_1 employee : employee1s) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * arg / 100);
                System.out.printf("%.2f  ", employee.getSalary());
            }
        }

    }

    public static Employee_1 getMinDepartmentSalary(int departmentNumber) {
        double min = 0;
        int index = 0;
        for (int i = 0; i < employee1s.length; i++) {
            if (employee1s[i] != null) {
                min = employee1s[i].getSalary();
                index = i;
                break;
            }
        }
        Employee_1 minSalary = employee1s[index];
        for (int i = index; i < employee1s.length; i++) {
            if (employee1s[i] == null) continue;
            if (employee1s[i].getSalary() < min && employee1s[i].getDepartment() == departmentNumber) {
                min = employee1s[i].getSalary();
                minSalary = employee1s[i];
            }
        }
        return minSalary;
    }

    public static Employee_1 getMaxDepartmentSalary(int departmentNumber) {
        double max = 0;
        int index = 0;
        Employee_1 maxSalary = null;
        for (int i = 0; i < employee1s.length; i++) {
            if (employee1s[i] != null) {
                max = employee1s[i].getSalary();
                maxSalary = employee1s[i];
                index = i;
                break;
            }
        }

        for (int i = index; i < employee1s.length; i++) {
            if (employee1s[i] == null) continue;
            if (employee1s[i].getSalary() > max && employee1s[i].getDepartment() == departmentNumber) {
                max = employee1s[i].getSalary();
                maxSalary = employee1s[i];
            }
        }
        return maxSalary;
    }
    public static double getSumSalaryDepartmentPerMonth(int departmentNumber) {
        double sum = 0;
        for (int i = 0; i < employee1s.length; i++) {
            if (employee1s[i] == null) continue;
            if (employee1s[i].getDepartment() == departmentNumber) {
                sum += employee1s[i].getSalary();
            }
        }
        return sum;
    }
    public static double getAverageSalaryDepartment(int departmentNumber) {
        double sum = 0;
        int countEmp = 0;
        for (int i = 0; i < employee1s.length; i++) {
            if (employee1s[i] == null) continue;
            if (employee1s[i].getDepartment() == departmentNumber) {
                countEmp++;
                sum += employee1s[i].getSalary();
            }
        }
        return sum / countEmp;
    }
    public static void getIndexSalaryDepartment(int departmentNumber) {
        for (Employee_1 employee : employee1s) {
            if (employee != null && employee.getDepartment() == departmentNumber) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * departmentNumber / 100);
                System.out.printf("%.2f  ", employee.getSalary());
            }
        }
    }
    public static void getAllEmployeesDepartment(int departmentNumber) {
        for (Employee_1 employee : employee1s) {
            if (employee != null && employee.getDepartment() == departmentNumber) {
                System.out.println("Информация о сотруднике: (Уникальный идентификатор = " + employee.getId() + ", " + employee.getPullName() + ", З/П в месяц: " + employee.getSalary() + ')');
            }
        }
    }
    public static void getAllEmployeesSalaryMin(double EmployeesSalary) {
        for (Employee_1 employee : employee1s) {
            if (employee != null && employee.getSalary() < EmployeesSalary) {
                System.out.println("Информация о сотруднике: (Уникальный идентификатор = " + employee.getId() + ", " + employee.getPullName() + ", З/П в месяц: " + employee.getSalary() + ')');
            }
        }
    }
    public static void getAllEmployeesSalaryMax(double EmployeesSalary) {
        for (Employee_1 employee : employee1s) {
            if (employee != null && employee.getSalary() >= EmployeesSalary) {
                System.out.println("Информация о сотруднике: (Уникальный идентификатор = " + employee.getId() + ", " + employee.getPullName() + ", З/П в месяц: " + employee.getSalary() + ')');
            }
        }
    }
}


