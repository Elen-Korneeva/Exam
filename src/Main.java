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

    }
    private static void all() {
        for (Employee_1 emp: employee1s) {
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
            if(employee1 == null) continue;
            sum += employee1.getSalary();
        }
        return sum;
    }
    public static Employee_1 getMaxSalary() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < employee1s.length; i++) {
            if(employee1s[i] != null) {
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
        return sum/count;
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
        for(Employee_1 employee1 : employee1s) {
            System.out.println(employee1.getPullName());
        }
    }
}