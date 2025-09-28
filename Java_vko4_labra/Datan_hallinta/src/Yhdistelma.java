import java.util.*;

public class Yhdistelma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Tehtävä C1: Opiskelijalista
        List<String> opiskelijat = new ArrayList<>();
        System.out.println("Kirjoita nimi. Lopettaa kirjoittamalla 'stop'");

        while (true) {
            String nimi = scanner.nextLine();
            if (nimi.equalsIgnoreCase("stop"))
                break;
            opiskelijat.add(nimi);
        }
        System.out.println("Opiskelijat: " + opiskelijat);
   
        
        //Tehtävä C2: Uniikit sanat
        Set<String> sanat = new HashSet<>();
        System.out.println("Kirjoita sanoja. Lopettaa kirjoittamalla 'lopeta'");
       
        while(true){
            String sana = scanner.nextLine();  
            if (sana.equalsIgnoreCase("lopeta"))
                break;
            sanat.add(sana);
        }
        System.out.println("Uniikkien sanojen määrä: " + sanat.size());
     

        //Tehtävä C3: Puhelinluettelo Mapilla
        Map<String,String> luettelo = new HashMap<>();
        luettelo.put("Max", "0456190033");
        luettelo.put("Oscar", "052385781");
        luettelo.put("Lando", "0639560204");

        System.out.println("Kirjoita listalta nimi: ");

        String haeNimi = scanner.nextLine();
        String numero = luettelo.get(haeNimi);

        if (numero != null) {
            System.out.println(haeNimi + " numero: " + numero);
        } else {
            System.out.println("Nimeä ei löytynyt");
        }
    
        
        //Tehtävä C4: Sanojen frekvenssilaskuri
        System.out.println("Kirjoita lause");
        String lause = scanner.nextLine();
        String[] sanatArray = lause.toLowerCase().split("\\s+");

        Map<String,Integer> frekvenssi = new HashMap<>();
        for(String s : sanatArray){
            frekvenssi.put(s, frekvenssi.getOrDefault(s, 0)+1);
        }
        System.out.println("Tiettyjen sanojen määrä:");
        for(Map.Entry<String, Integer> entry : frekvenssi.entrySet()){
             System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        
        scanner.close();
    }
}
