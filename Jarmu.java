public abstract class Jarmu {
    protected int aktualisSebesse;
    private String rendszam;

    public Jarmu(int aktualisSebesse, String rendszam) {
        this.aktualisSebesse = aktualisSebesse;
        this.rendszam = rendszam;
    }
    public boolean gyorshajtottE(int sebessegKorlat){
        return aktualisSebesse > sebessegKorlat;
    }

    @Override
    public String toString() {
        return  this.rendszam + " - " + this.aktualisSebesse + " km/h" ;
    }
}
