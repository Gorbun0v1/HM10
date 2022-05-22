import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;
    private String fullNameAuthor;

    public Author(String nameAuthor, String surnameAuthor, String fullNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
        this.fullNameAuthor = fullNameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

    public String getFullNameAuthor() {
        return this.fullNameAuthor;
    }

    @Override
    public String toString() {
        return fullNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor) && Objects.equals(fullNameAuthor, author.fullNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor, fullNameAuthor);
    }
}
