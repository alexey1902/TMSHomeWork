package Unit17.src.main.java.Unit17Task1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@XmlType(propOrder = {"homer", "marge" /*, "bart", "lisa", "maggie"*/}, name = "simpsons")
@XmlRootElement
class SimpsonFamily {
    public  String homer = "Homer";
    public  String marge = "Marge";
    public  String bart = "Bart";
    public  String lisa = "Lisa";
    public  String maggie = "Maggie";

    public String getHomer() {
        return homer;
    }

    public String getMarge() {
        return marge;
    }

    public String getBart() {
        return bart;
    }

    public String getLisa() {
        return lisa;
    }

    public String getMaggie() {
        return maggie;
    }

    @Override
    public String toString() {
        return "Simpsons{" + getHomer() + ' ' +
                getMarge() + ' ' +
                getBart()  + ' ' +
                getLisa()  + ' ' +
                getMaggie() + '}';
    }

}
public class SimpToXml {
    public void marshall(SimpsonFamily simpsons){
        try{
            JAXBContext context = JAXBContext.newInstance(SimpsonFamily.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(simpsons, new FileWriter("Unit17/src/main/java/simpsons.xml"));
        } catch (JAXBException | IOException exception){
            Logger.getLogger(SimpToXml.class.getName()).
                    log(Level.SEVERE, "marshallExample throws exception", exception);
        }
    }

    public static void main(String[] args) {
        SimpToXml simp = new SimpToXml();
        SimpsonFamily simpsons = new SimpsonFamily();
        simp.marshall(simpsons);
        System.out.println("Done");
    }
}