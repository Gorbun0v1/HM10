import java.util.Objects;

public class Book {
    private final String nameBook;
    private int bookYear;
    private final Author fullNameAuthor;


    public Book(String nameBook, int bookYear, Author fullNameAuthor) {
        this.nameBook = nameBook;
        this.bookYear = bookYear;
        this.fullNameAuthor = fullNameAuthor;

    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getBookYear() {
        return this.bookYear;
    }


    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
    public String toString() {
        return "Книга " + nameBook +" Год "+ bookYear + "Автор" + fullNameAuthor.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYear == book.bookYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(fullNameAuthor, book.fullNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, bookYear, fullNameAuthor);
    }
}
