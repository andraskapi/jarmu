public class AudiS8 extends Jarmu {

    private boolean lezerblokkolo;


    public AudiS8(int aktualisSebesse, String rendszam, boolean lezerblokkolo) {
        super(aktualisSebesse, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }

    @Override
    public boolean gyorshajtottE(int sebessegKorlat) {
        if(lezerblokkolo && sebessegKorlat < aktualisSebesse){
            return false;

        } return aktualisSebesse > sebessegKorlat;

    }
    @Override
    public String toString() {
        return "Audi: " + super.toString();
    }
}
