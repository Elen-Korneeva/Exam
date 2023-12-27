import java.util.Objects;

public class Employee_1 {

    private final int id;

    private static int counter;

    private String surname;

    private String name;

    private String middleName;

    private int department;

    private double salary;

    public Employee_1(String surname, String name, String middleName, int department, double salary) {
        if (department <= 0 || department > 5) throw new IllegalArgumentException("ошибка");
        counter++;
        this.id = getCounter();
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
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

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    private int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Employee_1{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public String getPullName() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_1 employee1 = (Employee_1) o;
        return id == employee1.id && department == employee1.department && Double.compare(salary, employee1.salary) == 0 && Objects.equals(surname, employee1.surname) && Objects.equals(name, employee1.name) && Objects.equals(middleName, employee1.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

