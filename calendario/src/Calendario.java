public class Calendario {

    private static Calendario istance;
    private int anno;
    private String[] mesi = {"Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno","Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"};
    private int[] giorniMesi = {31,28,31,30,31,30,31,31,30,31,30,31};
    private int[] giorniMesiBise = {31,29,31,30,31,30,31,31,30,31,30,31};
    private String[] stagioni = {"Inverno","Primavera","Estate","Autunno"};

    private Calendario() {
    }

    public static Calendario getIstance(){
        if(istance == null) {
            istance = new Calendario();
        }
        return istance;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public boolean bisestile(){
        if ((anno%4) == 0)
            return true;
        return false;
    }

    public void giornoAnno(int g){
        int i;
        boolean b;
        if(!(b = bisestile()))
            for (i = 0;i < 12 && g > 0;i++) {
                g = g - giorniMesi[i];
            }
        else{
            for (i = 0;i < 12 && g > 0;i++) {
                g = g - giorniMesiBise[i];
            }
        }
        if(i != 12)
            giornoStagione(i-1);
        else{
            stampaMale();
        }
    }

    public void giornoStagione(int i){
        if (mesi[i] == "Gennaio" || mesi[i] == "Febbraio" || mesi[i] == "Dicembre")
            stampaBene(i, 0);
        if (mesi[i] == "Marzo" || mesi[i] == "Aprile" || mesi[i] == "Maggio")
            stampaBene(i, 1);
        if (mesi[i] == "Giugno" || mesi[i] == "Luglio" || mesi[i] == "Agosto")
            stampaBene(i, 2);
        if (mesi[i] == "Settembre" || mesi[i] == "Ottobre" || mesi[i] == "Novembre")
            stampaBene(i, 3);
    }

    public void stampaBene(int mese,int stagione){
        System.out.println("\nMese: " + mesi[mese] + "\nStagione: "+ stagioni[stagione] + "\n");
    }

    public void stampaMale(){
        System.err.println("I dati inseriti non sono coretti");
    }
}
