package Collections.QueueInterface.Exam;

import java.util.ArrayDeque;
import java.util.Deque;

public class HospitalManangementSystem {
    private Deque<Patient> queue = new ArrayDeque<>();
    private int idCounter = 1;

    // them benh nhan vao hang cho
    public void addPatient(Patient patient) {
        if (patient.isPriority()) {
            queue.offerFirst(patient);
        } else {
            queue.offerLast(patient);
        }
        System.out.println("Added patient: " + patient);
    }

    // goi benh nhan
    public void callNextPatient() {
        if (queue.isEmpty()) {
            return;
        } else {
            Patient nextPatient = queue.poll();
            System.out.println("Calling next patient" + nextPatient);
        }
    }

    // hien thi danh sach
    public void showPatients() {
        queue.forEach(System.out::println);
    }

    // remove patient by id
    public void removePatient(int id)
    {
        boolean removed = queue.removeIf(patient -> patient.getId() == id);
        if (removed) {
            System.out.println("Patient with ID " + id + " has been removed from the queue.");
        } else {
            System.out.println("No patient found with ID " + id + ".");
        }
    }
}
