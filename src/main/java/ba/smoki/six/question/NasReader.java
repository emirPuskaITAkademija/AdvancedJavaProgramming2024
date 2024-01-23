package ba.smoki.six.question;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NasReader {

    public NasReader() throws MojaGreska{

    }

    public String nasContent() {
        try(FileReader fileReader = new FileReader("src/main/resources/lorem_input.txt")){
            return "";
        }catch (IOException e){
            System.err.println(e.getMessage());
            return e.getMessage();
        }

    }

    public void ucitaj(String ime) throws MojaGreska{
        if(ime.startsWith("A")){
            System.out.println("Sve OK");
        }else{
            throw new MojaGreska("Ime mora počinjati sa A");
        }
    }

}
