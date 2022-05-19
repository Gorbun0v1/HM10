public class Book {
    private Author author;
    private Author author2;
    private String nameBook;
    private int bookYear;

    public Book(String nameBook, int bookYear) {
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("Govard","Lovecraft");
        this.author = author1;
        this.author2 = author2;
        this.nameBook = nameBook;
        this.bookYear = bookYear;
    }

    public Author getAuthor() {
        return author;
    }

    public Author getAuthor2() {
        return author2;
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
