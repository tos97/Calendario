public class Calendario {

    private static Calendario istance;
    private int anno;
    private final int[] giorniMesi = {31,28,31,30,31,30,31,31,30,31,30,31};
    private final int[] giorniMesiBise = {31,29,31,30,31,30,31,31,30,31,30,31};

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
        if(g < 0){
            stampaBene(i);
        }
        else{
            stampaMale();
        }
    }

    public void stampaBene(int i){
        Stagioni stagione = Mesi.getStagione(i);
        System.out.println("\nMese: " + Mesi.getKeyFromValue(i) + "\nStagione: "+ stagione.name() + "\n\n");
    }

    public void stampaMale(){
        System.out.println("\nIl giorno è Errato deve essere compreso tra 0 e 365/366");
    }
}
