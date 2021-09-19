package Unit17Task2;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(propOrder = {"name","year","article","similarBooks"}, name ="books")
@XmlRootElement
public class Book {
    
    private int year;
    private int article;
    private String name;
    List<Book> similarBooks;

    public Book(){}

    public Book(List<Book> similarBooks) {
        this.similarBooks = similarBooks;
    }

    public Book(int article, String name, int year) {
        this.year = year;
        this.article = article;
        this.name = name;
        this.similarBooks = null;
    }

    public Book(int article, String name, int year, List<Book> similarBooks) {
        this.year = year;
        this.article = article;
        this.name = name;
        this.similarBooks = similarBooks;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) { this.year = year;}

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) { this.article = article; }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public List<Book> getSimilarBooks() {
        return similarBooks;
    }

    public void setSimilarBooks(List<Book> similarBooks) {
        this.similarBooks = similarBooks;
    }

    public void show(){
        System.out.println();
        System.out.println("Название: " + this.getName());
        System.out.println("Год: " + this.getYear());
        System.out.println("Артикль: " + this.getArticle());
        if(this.getSimilarBooks()!=null){
            System.out.println();
            System.out.println("|--------------------|");
            System.out.println("Книги этой же серии(" + this.getName() + "): ");
            getSimilarBooks().forEach(Book::show);
            System.out.print("|--------------------|");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Book> books;
        List<Book> listOfBooks;
        MarshallerExample marshaller = new MarshallerExample();
        listOfBooks =List.of(new Book(777, "Test", 2007 ),
                new Book(333, "Test2", 2009 ));
        books = List.of(new Book(1, "Name1", 2000 ),
                new Book(2, "Name2", 2002 ),
                new Book(3, "Name3", 2003 ),
                new Book(4, "Name4", 2004, listOfBooks));
        books.forEach(Book::show);
        marshaller.marshallBook(new Library(books));
        Library newLibrary = marshaller.unmarshallExample();
        newLibrary.getAllBooks().forEach(Book::show);
    }
}
