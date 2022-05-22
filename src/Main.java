public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King", "Stephen King");
        Author author2 = new Author("Govard","Lovecraft", "Govard Lovecraft");
        Book theDeadZone = new Book("The Dead Zone", 1983,author1);
        System.out.println(theDeadZone.getNameBook() + " " + theDeadZone.getBookYear() + " " + author1.getFullNameAuthor());
        theDeadZone.setBookYear(2016);
        System.out.println("Эту книгу я прочитал в " + theDeadZone.getBookYear());
        Book theWhispererInDarkness = new Book("The Whisperer in Darkness", 1931, author2);
        System.out.println(theWhispererInDarkness.getNameBook() +  " " + theWhispererInDarkness.getBookYear()+ " " + author2);
        theWhispererInDarkness.setBookYear(2020);
        System.out.println("Эту книгу я прочитал в " + theWhispererInDarkness.getBookYear());
    }

}