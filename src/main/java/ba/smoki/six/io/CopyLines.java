package ba.smoki.six.io;

import java.io.*;

/**
 * <p>
 *     <li>1. BufferedReader (FileReader)</li>
 *     <li>2. PrintWriter (FileWriter)</li>
 * </p>
 */
public class CopyLines {
    public static void main(String[] args) {
        //Decorator Design Pattern
        MojReader.outPerson.getName();
        try(BufferedReader in = new BufferedReader(new FileReader("src/main/resources/lorem_input.txt"));
            PrintWriter out= new PrintWriter(new FileWriter("src/main/resources/lorem_output.txt"))){
            String line;
            while ((line = in.readLine())!=null){
                System.out.println(line);
                out.println(line);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
