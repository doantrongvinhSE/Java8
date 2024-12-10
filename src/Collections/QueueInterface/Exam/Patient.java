package Collections.QueueInterface.Exam;

public class Patient {
    private int id;
    private String name;
    private int age;
    private boolean priority;

    public Patient(int id, String name, int age, boolean priority) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.priority = priority;
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

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", priority=" + priority +
                '}';
    }
}
