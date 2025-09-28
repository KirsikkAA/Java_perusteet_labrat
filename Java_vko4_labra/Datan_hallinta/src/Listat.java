import java.util.ArrayList;
import java.util.List;

public class Listat {
    public static void main(String[] args) {
        
        //Tehtävä L1: Luo lista ja lisää alkio
        List<String> lista = new ArrayList<>();
        lista.add("Omena");
        System.out.println(" " + lista);

        //Tehtävä L2: Lisää useita lukuja listaan
        List<Integer>lista1 = new ArrayList<>();
        lista1.add(10);
        lista1.add(20);
        System.out.println(" " + lista1);

        //Tehtävä L3: Hae alkio listasta
        List<String>lista2 = new ArrayList<>();
        lista2.add("Kissa");
        lista2.add("Koira");
        System.out.println("Ensimmäinen alkio: " + lista2.get(0));

        //Tehtävä L4: Poista alkio listasta
        List<String>lista3 = new ArrayList<>();
        lista3.add("A");
        lista3.add("B");
        lista3.add("C");
        System.out.println("Koko lista: " + lista3);
        lista3.remove(1);
        System.out.println("B poistettu lista: " + lista3);

        //Tehtävä L5: Listan koko
        List<String>lista4 = new ArrayList<>();
        lista4.add("Alkku");
        lista4.add("Belkku");
        lista4.add("Celkku");
        System.out.println("Listan koko: " + lista4.size());

        //Tehtävä L6: Listan läpikäynti
        List<Integer>lista5 = new ArrayList<>();
        lista5.add(1);
        lista5.add(2);
        lista5.add(3);

        for(int i = 0; i < lista5.size(); i++ ){
            System.out.println("Perinteinen for silmukka: " + lista5.get(i));
        }

        for(Integer luku : lista5){
            System.out.println("For-each silmukka: " + luku);
        }
    }
}

