package Unit17Task2;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(propOrder = {"allBooks"}, name ="library")
@XmlRootElement
public class Library {
    private List<Book> allBooks;

    public Library(){

    }
    public Library(List<Book> allBooks) {
        this.allBooks = allBooks;
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(List<Book> allBooks) {
        this.allBooks = allBooks;
    }
}
