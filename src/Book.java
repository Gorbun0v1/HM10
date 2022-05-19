public class Book {
    private String nameBook;
    private int bookYear;

    public Book(String nameBook, int bookYear) {
        this.nameBook = nameBook;
        this.bookYear = bookYear;
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

}
