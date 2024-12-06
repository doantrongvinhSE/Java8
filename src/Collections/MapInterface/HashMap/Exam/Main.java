package Collections.MapInterface.HashMap.Exam;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ManagerBook library = new ManagerBook();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Quản lý Thư viện ---");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Xóa sách");
            System.out.println("3. Tìm kiếm sách");
            System.out.println("4. Hiển thị danh sách sách");
            System.out.println("5. Cho mượn sách");
            System.out.println("6. Trả sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập mã sách: ");
                    Integer id = scanner.nextInt();
                    System.out.print("Nhập tên sách: ");
                    String title = scanner.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String author = scanner.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int year = scanner.nextInt();
                    System.out.print("Nhập số lượng sách: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    library.addBook(new Book(id, title, author, year, quantity));
                }
                case 2 -> {
                    System.out.print("Nhập mã sách muốn xóa: ");
                    Integer id = scanner.nextInt();
                    library.removeBook(id);
                }
                case 3 -> {
                    System.out.print("Nhập từ khóa tìm kiếm: ");
                    String keyword = scanner.nextLine();
                    library.searchBookByKeyword(keyword);
                }
                case 4 -> library.showBooks();
                case 5 -> {
                    System.out.print("Nhập mã sách muốn mượn: ");
                    Integer id = scanner.nextInt();
                    library.borrowBook(id);
                }
                case 6 -> {
                    System.out.print("Nhập mã sách muốn trả: ");
                    Integer id = scanner.nextInt();
                    library.returnBook(id);
                }
                case 0 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        scanner.close();
    }
}


