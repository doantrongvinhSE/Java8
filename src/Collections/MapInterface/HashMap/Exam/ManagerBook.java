package Collections.MapInterface.HashMap.Exam;

import java.util.HashMap;

public class ManagerBook {
    private HashMap<Integer, Book> library;

    public ManagerBook() {
        this.library = new HashMap<>();
    }

    public ManagerBook(HashMap<Integer, Book> library) {
        this.library = library;
    }

    

    public void addBook(Book book) {
        // check id
        if (library.containsKey(book.getId())) {
            System.out.println("Sách với mã " + book.getId() + " đã tồn tại!");
        } else {
            library.put(book.getId(), book);
            System.out.println("Thêm sách thành công: " + book.getTitle());
        }
    }


    public void removeBook(Integer id) {
        if (library.remove(id) != null) {
            System.out.println("Remove Success!");
        } else {
            System.out.println("Không tìm thấy sách với mã " + id);
        }
    }

    public void searchBookByKeyword(String keyword) {
        boolean founded = false;
        for(Book book : library.values()) {
            if (book.getAuthor().contains(keyword) || book.getTitle().contains(keyword)) {
                System.out.println(book);
                founded=true;
            }
        }
        if (!founded) {
            System.out.println("Không tìm thấy sách với từ khóa: " + keyword);
        }
    }

    // cho muon sach
    public void borrowBook(Integer id) {
        Book book = library.get(id);
        if (book != null) {
            if (book.getQuality() > 0) {
                book.setQuality(book.getQuality() - 1);
                System.out.println("Mượn sách thành công: " + book.getTitle());
            } else {
                System.out.println("Sách " + book.getTitle() + " đã hết!");
            }
        } else {
            System.out.println("Not founded");
        }
    }

    public void returnBook(Integer id) {
        Book book = library.get(id);
        if (book != null) {
            book.setQuality(book.getQuality() + 1);
            System.out.println("Tra sách thành công: " + book.getTitle());
        } else {
            System.out.println("Not founded");
        }
    }

    public void showBooks() {
        if (library.isEmpty()) {
            System.out.println("Thư viện không có sách nào.");
        } else {
            library.values().stream().forEach(System.out::println);
        }
    }

    
}
