import java.util.Arrays;

/**
 * Beschreiben Sie hier die Klasse Lotto.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Lotto
{
    private int[] zahlensammlung = {0,0,0,0,0,0};
    private String[] zahlensammlungstr = {"0","0","0","0","0","0"};
    private int[] zahlsort;
    private int[] zahlsortprim = {0,0,0,0,0,0};
    /**
     * Konstruktor für Objekte der Klasse Lotto
     */
    public Lotto()
    {
        // Instanzvariable initialisieren
        zufallszahl();
        System.out.println(zahlensammlungstr);
        sortierenprim();
    }
    
    public void zufallszahl() {
        for(int i = 0; i<zahlensammlung.length; i++) {
            int x = 0;
            System.out.println(i);
            x = (int)(Math.random()*49)+1;
            int check = i;
            boolean gleich = false;
            for(check = check; check>=0; check--) {
                if(zahlensammlung[check] == x) {
                    gleich = true;
                }
            }
            if(gleich == true) {
                i = i-1;
            }
            else {
                zahlensammlung[i] = x;
                zahlensammlungstr[i] = Integer.toString(x);
            } 
                
        }
    }
    public void sortieren() {
        zahlsort = zahlensammlung;
        Arrays.sort(zahlsort);
    }
    public void sortierenprim() {
        for (int i = 0; i<zahlensammlung.length; i++) {
            int x = 0;//Zahl, die verschoben wird
            int y = 0;
            int z = 0;
            int idec = i-1;
            int[] borders = {0,0};
            String wv = 0;
            test = false;
            if(zahlensammlung[i] < zahlensammlung[idec]) { //ist i größer als links 1-
                test = true;
            }
            if (test == true) { //wenn ja
                for(int y=0; y<i;y++) {//was ist kleiner, hochzählen
                    if(zahlensammlung[i] < zahlensammlung[y]) {//ist i größer als y? (y = position der überprüften Zahlen)
                        z = y;//z ist die Position der gefundenen Zahl(y)
                    }
                }
                border[0] = zahlensammlung[z+1];//linker rand des Verschiebens ist z+1
                border[1] = zahlensammlung[i];//rechter rand ist i
                
                wv = border[1] - border[2]; //wie viele Stellen braucht der zwischenarray, der nun deklariert wird
                int[] verschiebearr = new verschiebearr[wv];
                
                
            }
        }
    }

    public void clear() {
        zahlensammlungstr = {"0","0","0","0","0","0"};
        zahlensammlung = {0,0,0,0,0,0};
        zahlsortprim = {0,0,0,0,0,0};
        zahlsort = zahlensammlung;
    }

    
}
//https://github.com/Ferd-fb/SchulprojektLottozahlen.git
