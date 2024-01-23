package ba.smoki.six.question;

public class ReaderTester {
    public static void main(String[] args)  {
        try {
            NasReader nasReader = new NasReader();
            nasReader.nasContent();

            try {
                nasReader.ucitaj("Armane");
            } catch (MojaGreska greska) {
                System.err.println(greska.getMessage());
            }
        }catch (MojaGreska mojaGreska){
            System.err.println(mojaGreska.getMessage());
        }

    }
}
