
public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("Лев Толстой", "Война и мир", 1869);
        // Выводим на экран значения свойств книги
        System.out.println("Автор книги: " + book.getAuthor());
        System.out.println("Название книги: " + book.getTitle());
        System.out.println("Год написания книги: " + book.getYear());
        // Изменяем значения свойств книги
        book.setAuthor("Федор Достоевский");
        book.setTitle("Преступление и наказание");
        book.setYear(1866);
        // Выводим на экран новые значения свойств книги
        System.out.println("Новый автор книги: " + book.getAuthor());
        System.out.println("Новое название книги: " + book.getTitle());
        System.out.println("Новый год написания книги: " + book.getYear());
    }
}