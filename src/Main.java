public class Main {
    public static void main(String[] args) {
        Book theDeadZone = new Book("The Dead Zone", 1983);
        Author stephenKing = new Author("Stephen", "King");
        System.out.println(theDeadZone.getNameBook() + " " + theDeadZone.getBookYear() + " " + stephenKing.getNameAuthor() + " " + stephenKing.getSurnameAuthor());
        theDeadZone.setBookYear(2014);
        System.out.println("Эту книгу я прочитал в " + theDeadZone.getBookYear());
        Book theWhispererInDarkness = new Book("The Whisperer in Darkness", 1931);
        Author govardLovecraft = new Author("Govard", "Lovecraft");
        System.out.println(theWhispererInDarkness.getNameBook() +  " " + theWhispererInDarkness.getBookYear()+ " " + govardLovecraft.getNameAuthor()+ " " + govardLovecraft.getSurnameAuthor());
        theWhispererInDarkness.setBookYear(2020);
        System.out.println("Эту книгу я прочитал в " + theWhispererInDarkness.getBookYear());
    }
}