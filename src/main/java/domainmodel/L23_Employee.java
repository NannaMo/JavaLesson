package domainmodel;

public class L23_Employee {

    private static int id;
    private String name;
    private String position;
    private int salary;


    public L23_Employee(String name, String position, int salary) {
        id = id+1;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "L23_Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
