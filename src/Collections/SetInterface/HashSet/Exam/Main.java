package Collections.SetInterface.HashSet.Exam;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Kire"));
        students.add(new Student(1, "Koko"));
        System.out.println(students);

        // show all student
        students.forEach(System.out::println);


        // find student by id
        students.stream().filter(student -> student.getId() == 3).forEach(System.out::println);

        // remove by id
        students.removeIf(student -> student.getId() == 2);
        System.out.println(students);
    }
}
