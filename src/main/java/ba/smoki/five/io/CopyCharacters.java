package ba.smoki.five.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
 * <p>
 * <li>FileReader</li>
 * <li>FileWriter</li>
 * </p>
 * Zadaća:
 * <p>
 * Ideja programa jeste da izbrojimo koliko se u nekom tekstu pojavljuje
 * neko slovo. Kao rezultat zelimo prikazati u konzoli:
 * "A" 2000 puta
 * "b" 234 puta
 * ...
 * </p>
 */
public class CopyCharacters {
    public static void main(String[] args) {
        // slovo  key: e    value: 1
        Map<Character, Integer> map = new HashMap<>();


        try (FileReader in = new FileReader("src/main/resources/ulaz.txt");
             FileWriter out = new FileWriter("src/main/resources/izlaz.txt")) {
            int slovo;
            while ((slovo = in.read()) != -1) {
                System.out.print((char) slovo);
                Character slovoKaoKarakter = (char) slovo;
                int count = map.getOrDefault(slovoKaoKarakter, 0);
                map.put(slovoKaoKarakter, count + 1);
                out.write(slovo);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        Set<Map.Entry<Character, Integer>> entrySet =  map.entrySet();
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(entrySet);
        Komparator komparator = new Komparator();
        Comparator<Map.Entry<Character, Integer>> lambdaComparator = (o1, o2) ->o2.getValue().compareTo(o1.getValue());
        entryList.sort(lambdaComparator);
//        entryList.sort(Map.Entry.<Character, Integer>comparingByValue().reversed());
        for (Map.Entry<Character, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    private static class Komparator implements Comparator<Map.Entry<Character, Integer>>{

        //-1 0 1
        @Override
        public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {

            return o2.getValue().compareTo(o1.getValue());
        }
    }
}
