public enum Mesi {

    GENNAIO("Gennaio", 1),
    FEBBRAIO("Febbraio", 2),
    MARZO("Marzo", 3),
    APRILE("Aprile", 4),
    MAGGIO("Maggio", 5),
    GIUGNO("Giugno", 6),
    LUGLIO("Luglio", 7),
    AGOSTO("Agosto", 8),
    SETTEMBRE("Settembre", 9),
    OTTOBRE("Ottobre", 10),
    NOVEMBRE("Novembre", 11),
    DICEMBRE("Dicembre", 12);

    private final String key;
    private final int value;

    Mesi(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public static String getKeyFromValue(int vv){
        switch (vv) {
            case 12:
                return DICEMBRE.getKey();
            case 1:
                return GENNAIO.getKey();
            case 2:
                return FEBBRAIO.getKey();
            case 3:
                return MARZO.getKey();
            case 4:
                return APRILE.getKey();
            case 5:
                return MAGGIO.getKey();
            case 6:
                return GIUGNO.getKey();
            case 7:
                return LUGLIO.getKey();
            case 8:
                return AGOSTO.getKey();
            case 9:
                return SETTEMBRE.getKey();
            case 10:
                return OTTOBRE.getKey();
            case 11:
                return NOVEMBRE.getKey();
        }
        return "ERRORE";
    }

    public static Stagioni getStagione(int vv){
        switch (vv) {
            case 12:
            case 1:
            case 2:
                return Stagioni.INVERNO;
            case 3:
            case 4:
            case 5:
                return Stagioni.PRIMAVERA;
            case 6:
            case 7:
            case 8:
                return Stagioni.ESTATE;
            case 9:
            case 10:
            case 11:
                return Stagioni.AUTUNNO;
        }
        return Stagioni.INVERNO;
    }
}
