import java.util.Map;
import java.util.HashMap;

public class Mapit {
    public static void main(String[] args) {

        //Tehtävä M1: Perustoiminnot Mapilla
        Map<String, Integer> mappi = new HashMap<>();
        mappi.put("A", 1);
        mappi.put("B", 2);
        System.out.println("Arvo avaimella A: " + mappi.get("A"));

        //Tehtävä M2: Mapin läpikäynti
        Map<String, Integer> mappi2 = new HashMap<>();
        mappi2.put("Marc", 93);
        mappi2.put("Alex", 73);
        mappi2.put("Valentino", 46);

        for (Map.Entry<String, Integer> entry : mappi2.entrySet()) {
            System.out.println("EntrySet: " + entry.getKey() + " = " + entry.getValue());
        }

        //Tehtävä M3: Tulosta vain avaimet
        Map<Integer, String> mappi3 = new HashMap<>();
        mappi3.put(1, "punainen");
        mappi3.put(2, "sininen");

        for (Integer avain : mappi3.keySet()) {
            System.out.println("Avaimet: " + avain + " ");
        }
    }
}
