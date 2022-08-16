import java.math.BigDecimal;
import java.util.Objects;

public class Book {
    private int id;
    private String author;
    private String title;
    private BigDecimal price;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceWithSalesTax() {
        if(price.compareTo(BigDecimal.ZERO)<0)
        {
            throw new NumberFormatException();
        }
        return price.multiply(new BigDecimal("1.06"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Objects.equals(author, book.author) && Objects.equals(title, book.title) && Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, title, price);
    }
}
