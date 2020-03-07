import java.util.Objects;

public class Book {
    private String isbn;
    private String title;
    private String authors;
    private int pages;

    public Book(String isbn, String title, String authors, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getIsbn().equals(book.getIsbn());
//        return isbn !=
}

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn());
    }
}
