public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println(isEven(7));
        //System.out.println(sign(-5));
        //System.out.println(describe(3));
        //System.out.println(order2(77,-22));
        //System.out.println(order3(2,7,5));
        //System.out.println(line(6,9));
        //System.out.println(table10(2));
        //System.out.println(check("java123"));
        //System.out.println(login(new String[]{"no","java123","x"}));
        
        System.out.println(average(new int[]{-1,20,3,7}));
        System.out.println(max(new int[]{-1,20,3,7}));
}

//Tehtävä 1 - Parillisuus
static boolean isEven(int n){
if(n % 2 == 0) {
    return true;
    } else {
        return false;
    }
}

//Tehtävä 2 - Luvun merkki
static String sign(int n) {
if(n > 0){
    return "Positiivinen";
} else if(n < 0) {
        return "Negatiivinen";
    } else {
        return "Nolla";
    }
}

//Tehtävä 3 - Luvun ominaisuudet - yhdistä 1 ja 2
static String describe(int n){
if(n == 0) {
    return "Nolla";
} else if (n > 0){
    if(n % 2 == 0){
        return "Positiivinen parillinen";
    } else {
        return "Positiivinen pariton";
    }
} else {
    if(n % 2 == 0){
        return "Negatiivinen parillinen";
    } else {
        return "Negatiivinen pariton";
    }
    }
}

//Tehtävä 4 - Kahden luvun järjestys
static String order2(int a,int b){
    int max = Math.max(a,b);
    int min = Math.min(a,b);
    return min + " " + max;
}

//Tehtävä 5 - Kolmen luvun järjestys (ilman Arrays.sort)
static String order3(int a,int b,int c){
    int max = Math.max(a,Math.max(b,c));
    int min = Math.min(a,Math.min(b,c));
    int mid = a + b + c - min - max;

    return min + ", " + mid + ", " + max;
}

//Tehtävä 6 - Kertotaulun rivi
static String line(int n,int i){
String tulos = (n * i) + "\n";
return tulos;
}

//Tehtävä 7 - Kertotaulu 1..10
static String table10(int n){
 String tulos = "";

 for(int i = 1; i <= 10; i++){
    tulos += (n * i) + "\n";
 }
  return tulos;
}

//Tehtävä 8 - Salasanan tarkistus (yksi syöte)
static boolean check(String s){
 return "java123".equals(s);
}


//Tehtävä 9 - Salasanayritykset (kolme yritystä)
static String login(String[] tries){
 int m = Math.min(3,tries.length);
 for(int i = 0; i < m; i++){
    if("java123".equals(tries[i])){
        return "Tervetuloa!";
    }
 }
 return "Liian monta...";
}

//Tehtävä 10 - Taulukon tilastot
static double average(int[] a){
    if(a.length == 0){
        return 0.0;
    }
    int sum = 0;
    for(int x : a){
        sum += x;
    }
    return (double) sum / a.length;
}

static int max(int[] a){
    if(a.length == 0){
        return Integer.MIN_VALUE;
    }
        int maxVal = a[0];
        for(int x : a){
            if(x > maxVal){
                maxVal = x;
            }
        } 
        return maxVal;  
    }


}
