package ba.smoki.five.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Ideja je da pročitamo sadržaj fajla čitajuć 8-bitni zapis.
 * <p>
 * InputStream & OutputStream
 * <li>FileInputStream</li>fis
 * <li>FileOutputStream</li>fos
 * </p>
 * <p>
 * Detekcija i obrada grešaka.
 * "Exception handling".
 * </p>
 * Zaključak:
 * <li>
 *     1. try blok koda se izvršava kada ?
 *     Kada je sve u redu i bez greške.
 *     2. Ko se rada ne izvršava ?
 *     catch blok koda se tada ne izvršava. Zašto ?
 *     Zato što nema greške.
 *     3. finnaly : mene ne zanima kaže finally jer se ja izvršavam neovisno od vas
 *     dvojice.
 * </li>
 * <li>
 *     1. try blok koda se ne izvršava do kraja kako treba ?
 *     Kada ?
 *     Kada se unutar tog blok koda desi greška..
 *     2. catch blok koda: mora uhvatiti grešku.
 *     Zbog čega ?
 *     da znamo o kakvoj greški se radi....
 *     3. finnaly: opet mene ne zanima ja se uvijek izvršavam
 * </li>
 * try-catch
 * try-with multiple catch
 * <P>
 *     ZAKLJUČAK: 1.7 try-with-resource
 * </P>
 */
public class CopyBytes {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("src/main/resources/input.txt");
            FileOutputStream fos = new FileOutputStream("src/main/resources/output.txt")) {
            int c;// zeko pije mlijeko
            while((c = fis.read())!= -1){
                System.out.print((char)c);
                fos.write(c);
            }
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
