import java.util.Objects;

public class Book extends Product {

    private String author;
    private int pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString()+
                "author:" + "             "+author +"\n"+
                "pages:" + "              " +pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Book))
            return false;
        if (!super.equals(o))
            return false;
        Book book = (Book) o;
        return this.pages == book.pages &&
                Objects.equals(this.author, book.author);
    }


    }
