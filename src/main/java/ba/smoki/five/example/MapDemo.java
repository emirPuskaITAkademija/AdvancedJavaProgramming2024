package ba.smoki.five.example;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        Mapa<Character, Integer> mapaVarijabla = new Mapa<>();
        Mapa.Entrance<Character, Integer> mapaEntrance = new Mapa.Entrance<>();
        Mapa.Entry entry = mapaVarijabla.new Entry();

        HashMap<Character, Integer> hashMap = new HashMap<>();
    }
}
