package Unit17Task3;

import Unit17Task2.Book;
import Unit17Task2.Library;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Converter {
    private static final String baseFile = "Unit17/src/main/java/Unit17Task3/books.xml";
    public static void toJSON(Library library) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), library);
        System.out.println("json converted!");
    }

    public static Library toJavaObject() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseFile), Library.class);
    }

    public static void main(String[] args) throws IOException {
        List<Book> books;
        List<Book> listOfBooks;
        listOfBooks =List.of(new Book(777, "Test", 2007 ),
                new Book(333, "Test2", 2009 ));
        books = List.of(new Book(1, "Name1", 2000 ),
                new Book(2, "Name2", 2002 ),
                new Book(3, "Name3", 2003 ),
                new Book(4, "Name4", 2004, listOfBooks));
        Library library = new Library(books);
        toJSON(library);
        Library newLibrary = toJavaObject();
        newLibrary.getAllBooks().forEach(Book::show);
    }
}