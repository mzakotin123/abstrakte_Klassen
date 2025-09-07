package fahrzeuge;

public class Taxi extends Verkehrsmittel{

    public Taxi(double geschwindigkeit, double preis, double treibstoff) {
        super(geschwindigkeit, preis, treibstoff);
    }

    @Override
    public String getArt() {
        return "Taxi";
    }

    @Override
    public double getZeitInStunden() {
        return 0.167; // 10 Minuten in Stunden
    }

    @Override
    public double getStreckeInKm() {
        return 3.0;
    }

    @Override
    public double getPreisProKm() {
        return preis;
    }

    public boolean zuWenigTreibstoff() {
        return treibstoff < getStreckeInKm();
    }
}
