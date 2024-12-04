package Collections.ListInterface.ArrayList.Exam;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StudentService {
    private ArrayList<Student> students;

    public StudentService(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Student getStudentByName(String name) {
        return this.students.stream().filter(student -> student.getName().equals(name)).findFirst().orElse(null);
    }

    public void removeStudentByName(String name) {
        this.students.remove(getStudentByName(name));
    }



    @Override
    public String toString() {
        return "StudentService{" +
                "students=" + students +
                '}';
    }
}
