package Collections.ListInterface.ArrayList.Exam;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = getStudents();
        StudentService studentService = new StudentService(students);
        System.out.println(studentService.getStudents());
        studentService.addStudent(new Student("Lam", 19, 7));
        System.out.println(studentService.getStudents());
        studentService.removeStudentByName("Vinh");
        System.out.println(studentService.getStudents());
        System.out.println(studentService.getStudentByName("Quoc"));



    }

    public static ArrayList<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Vinh", 22, 9.8));
        students.add(new Student("Nam", 21, 6));
        students.add(new Student("Quoc", 20, 7.5));
        students.add(new Student("Loan", 26, 8.0));
        students.add(new Student("Phu", 18, 5));
        students.add(new Student("Tinh", 20, 7.8));
        return students;
    }
}
