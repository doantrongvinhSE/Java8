package Collections.MapInterface.HashMap.Exam;

public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private int quality;

    public Book() {
    }

    public Book(int id, String title, String author, int year, int quality) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.quality = quality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", quality=" + quality
                + "]";
    }
}
