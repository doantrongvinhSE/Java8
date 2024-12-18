package Compare.Comparable;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        return Integer.compare(this.id, o.id); // tăng dần
//        return this.id - o.id;
//        return Integer.compare(o.id, this.id); // giam dan
//        return this.name.compareTo(o.name); // su dung wrapper thi moi sd
        // duoc pt compareTo

        // neu tieu chi 1 = nhau => tieu  chi 2
        if (this.id == o.id) {
            return this.name.compareTo(o.name);
        }
        return this.id - o.id;

    }
}