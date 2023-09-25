
public class Book {
    private String author;
    private String title;
    private int year;


    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // Метод для получения значения автора книги
    public String getAuthor() {
        return author;
    }

    // Метод для изменения значения автора книги
    public void setAuthor(String author) {
        this.author = author;
    }

    // Метод для получения значения названия книги
    public String getTitle() {
        return title;
    }

    // Метод для изменения значения названия книги
    public void setTitle(String title) {
        this.title = title;
    }

    // Метод для получения значения года написания книги
    public int getYear() {
        return year;
    }

    // Метод для изменения значения года написания книги
    public void setYear(int year) {
        this.year = year;
    }
}
