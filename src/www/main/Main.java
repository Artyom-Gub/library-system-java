package www.main;

import www.main.items.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book.BookBuilder("Sample book 1", "Sample author 1", 2026).build();
        Book book2 = new Book.BookBuilder("Sample book 2", "Sample author 2", 2026).build();
        Book book3 = new Book.BookBuilder("Sample book 3", "Sample author 3", 2026).build();

        /*template for array of books*/
        List<Book> books = new ArrayList<>(List.of(book1, book2, book3));

        /*template for book menu*/
        System.out.println("Books: ");

        for(var item : books) {
            System.out.println(item);
        }
    }
}
