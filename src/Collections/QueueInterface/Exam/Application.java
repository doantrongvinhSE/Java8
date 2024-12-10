package Collections.QueueInterface.Exam;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        HospitalManangementSystem system = new HospitalManangementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Call Next Patient");
            System.out.println("3. Display Queue");
            System.out.println("4. Remove Patient");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Is priority (true/false): ");
                    boolean priority = scanner.nextBoolean();
                    system.addPatient(new Patient(id, name, age, priority));
                    break;
                case 2:
                    system.callNextPatient();
                    break;
                case 3:
                    system.showPatients();
                    break;
                case 4:
                    System.out.print("Enter patient ID to remove: ");
                    int idPatient = scanner.nextInt();
                    system.removePatient(idPatient);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
