package Unit17Task2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MarshallerExample {
    public void marshallBook(Library library){
        try{
            JAXBContext context = JAXBContext.newInstance(Library.class);
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(library, new FileWriter("Unit17/src/main/java/Unit17Task2/books.xml"));
        } catch (JAXBException | IOException exception){
            Logger.getLogger(MarshallerExample.class.getName()).
                    log(Level.SEVERE, "marshallExample throws exception", exception);
        }
    }
    public Library unmarshallExample(){
        Library unmarshal = new Library(null);
        try{
            File file = new File("Unit17/src/main/java/Unit17Task2/books.xml");
            JAXBContext context = JAXBContext.newInstance(Library.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            unmarshal = (Library)unmarshaller.unmarshal(file);
            System.out.println(unmarshal);
        }catch(JAXBException exception){
            exception.printStackTrace();
        }
        return  unmarshal;
    }
}
