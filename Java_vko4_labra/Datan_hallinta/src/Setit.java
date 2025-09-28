import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Setit {
    public static void main(String[] args) {

        //Tehtävä S1: Luo Set
        Set<String> setti = new HashSet<>();
        setti.add("Aurinko");
        setti.add("Kuu");
        System.out.println(" " + setti);

        //Tehtävä S2: Duplikaatti Setissä
        Set<Integer> setti2 = new HashSet<>();
        setti2.add(4);
        setti2.add(4);
        System.out.println("Dublikaatit eivät toimi: " + setti2);

        //Tehtävä S3: TreeSet ja järjestys
        TreeSet<Integer> setti3 = new TreeSet<>();
        setti3.add(2);
        setti3.add(1);
        setti3.add(3);
        System.out.println("Pitää nousevassa järjestyksessä " + setti3);
    }
}
