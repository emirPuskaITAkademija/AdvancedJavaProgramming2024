package ba.smoki.six.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

/**
 * ZADAĆA: Pročitati sadržaj fajla brojevi_US.txt i brojeve konvertovati u drugu
 * lokalizaciju GERMANY. Nakon toga ih ubaciti u fajl koji se
 * zove brojevi_DE.txt
 */
public class ScanDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/main/resources/lorem_input.txt")))) {
            scanner.useLocale(Locale.US);
            double sum = 0.0;
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    double number = scanner.nextDouble();
                    System.out.println("Broj: " + number);
                    sum = sum + number;
                } else {
                    String tokenBasedContent = scanner.next();
                    System.out.println(tokenBasedContent);
                }
            }
            System.out.println("Suma svih brojeva u fajlu po US lokalizaciji = " + sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
