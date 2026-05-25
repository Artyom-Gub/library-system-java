package www.main.items;

import java.util.Objects;

/*Pattern Builder*/
public class Book {
    private String title;
    private String author;
    private int year_of_the_publication;

    private boolean isBestSeller;

    private Book(BookBuilder bookBuilder) {
        this.title = bookBuilder.title;
        this.author = bookBuilder.author;
        this.year_of_the_publication = bookBuilder.year_of_the_publication;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    int getYear_of_the_publication() {
        return year_of_the_publication;
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private int year_of_the_publication;

        private boolean isBestSeller;

        public BookBuilder(String title, String author, int year_of_the_publication) {
            this.title = title;
            this.author = author;
            this.year_of_the_publication = year_of_the_publication;
        }

        public BookBuilder setBestSeller(boolean isBestSeller) {
            this.isBestSeller = isBestSeller;

            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + year_of_the_publication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, year_of_the_publication);
    }
}

