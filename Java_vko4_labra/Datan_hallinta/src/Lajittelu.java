import java.util.*;

public class Lajittelu {
    public static void main(String[] args) {

        //Tehtävä A1: Listan lajittelu
        List<String> lajittelu = new ArrayList<>(Arrays.asList("c", "a", "b"));
        Collections.sort(lajittelu);
        System.out.println(" " + lajittelu);

        //Tehtävä A2: Mukautettu lajittelu
        List<String> lajittelu2 = new ArrayList<>(Arrays.asList("Valentino", "Casey", "Dani", "Jorge"));
        lajittelu2.sort(Comparator.comparingInt(String:: length));
        System.out.println("Lajittelu pituuden mukaan: " + lajittelu2);

        //Tehtävä A3: TreeMap
        TreeMap<Integer,String> lajittelu3 = new TreeMap<>();
        lajittelu3.put(2, "Vale");
        lajittelu3.put(3, "Marc");
        lajittelu3.put(1, "Jorge");
        System.out.println(" " + lajittelu3);
    }
}
