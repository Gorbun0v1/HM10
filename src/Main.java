public class Main {
    public static void main(String[] args) {
        Book theDeadZone = new Book("The Dead Zone", 1983);
        System.out.println(theDeadZone.getNameBook() + " " + theDeadZone.getBookYear() + " " + theDeadZone.getAuthor().getSurnameAuthor());
        theDeadZone.setBookYear(2014);
        System.out.println("Эту книгу я прочитал в " + theDeadZone.getBookYear());
        Book theWhispererInDarkness = new Book("The Whisperer in Darkness", 1931);
        System.out.println(theWhispererInDarkness.getNameBook() +  " " + theWhispererInDarkness.getBookYear()+ " " + theWhispererInDarkness.getAuthor2().getSurnameAuthor());
        theWhispererInDarkness.setBookYear(2020);
        System.out.println("Эту книгу я прочитал в " + theWhispererInDarkness.getBookYear());
    }
}