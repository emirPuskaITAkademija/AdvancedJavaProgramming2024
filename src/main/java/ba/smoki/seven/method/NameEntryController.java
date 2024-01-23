package ba.smoki.seven.method;

import java.util.*;
import java.util.function.Consumer;

public class NameEntryController {
    public static void main(String[] args) {
        System.out.println("Unesi omiljeno ime i pritisni enter ili unesi -1 za izlaz");
        List<String> names = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String name = scanner.nextLine();
                if (name.equals("-1")) {
                    break;
                }
                names.add(name);
            }
        }
        //LAMBDA operator ispisati sve u konzolu elemente
        Consumer<String> nameConsumer = name -> System.out.println(name);
        NameComparator nameComparator = new NameComparator();
        //Collections.sort(names, nameComparator); 1.7
        /**
         * Kada procesiramo kolekciju korištenjem streamova(spliterator) postoje tri vrste
         * operacija/funkcija/metoda:
         * <li>1. izvor stream stream()</li>
         * <li>2. međiuoperacije/međufunkcije ili međumetode</li>
         * <li>3. terminirajuća operacija odnosno operacija ili metoda koja terminira stream</li>
         */
        NameComparator nasComparator = new NameComparator();
//        Comparator<String> komparator = (n1, n2)->n2.compareTo(n1);
        names.stream()//1. izvire stream imena
                .sorted(nasComparator::compare)//2. međuoperacija/međufunkcija ...funkcija koju pozovem nad stream i ona vrati modifikovan stream
                .forEach(System.out::println);//3. terminirajuća operacija
    }

    static class NameComparator implements Comparator<String>{

        @Override
        public int compare(String name1, String name2) {
            System.out.println(name1 + " se  poredi sa " +name2);
            return name2.compareTo(name1);
        }
    }
}
