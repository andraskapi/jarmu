public class Robogo extends Jarmu implements KisGepjarmu {

    private int maxSebesseg;

    public Robogo(int aktualisSebesse, String rendszam, int maxSebesseg) {
        super(aktualisSebesse, rendszam);
        this.maxSebesseg = maxSebesseg;
    }


    @Override
    public boolean haladhatItt(int sebesseg) {
        return maxSebesseg < sebesseg;

    }
    public boolean gyorshajtottE(int sebessegKorlat){
        return aktualisSebesse > sebessegKorlat;
    }

    @Override
    public String toString() {
        return "Robogo: " + super.toString();
    }


}
