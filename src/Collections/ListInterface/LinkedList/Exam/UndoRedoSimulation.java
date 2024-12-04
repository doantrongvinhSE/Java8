package Collections.ListInterface.LinkedList.Exam;

import java.util.LinkedList;
import java.util.Scanner;

public class UndoRedoSimulation {
    public static void main(String[] args) {
        LinkedList<String> actions = new LinkedList<String>(); // luu hanh dong da thuc hien
        LinkedList<String> redoStack = new LinkedList<>(); // Luu cac hanh dong bi Undo

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm hành động");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Hiển thị lịch sử hành động");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Bỏ qua dòng nhập trống

            switch (choice) {
                case 1:
                    System.out.print("Nhập hành động: ");
                    String action = scanner.nextLine();
                    actions.add(action); // thêm hd mơi
//                    redoStack.clear();
                    System.out.println("Đã thêm hành động: " + action);
                    break;
                case 2:
                    if (!actions.isEmpty()) {
                        String lastAction = actions.removeFirst(); // Lấy hành động cuối cùng
                        redoStack.addFirst(lastAction); // Thêm hành động vừa undo vào redoStack
                        System.out.println("Undo hành động: " + lastAction);
                    } else {
                        System.out.println("Không có hành động nào để Undo.");
                    }
                    break;
                case 3:
                    if (!redoStack.isEmpty()) {
                        String redoAction = redoStack.removeFirst(); // Lấy hành động cuối cùng
                        actions.add(redoAction); // dua hanh dong tro lai
                        System.out.println("Redo hành động: " + redoAction);
                    } else {
                        System.out.println("Không có hành động nào để Redo.");
                    }
                case 4:
                    System.out.println("Hành động hiện tại:");
                    System.out.println(actions.isEmpty() ? "Không có hành động nào." : actions);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");


            }
        }
    }
}
