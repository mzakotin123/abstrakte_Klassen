package fahrzeuge;

public class Bus extends Verkehrsmittel{
    public Bus(double geschwindigkeit, double preis, double treibstoff) {
        super(geschwindigkeit, preis, treibstoff);
    }

    @Override
    public String getArt() {
        return "Bus";
    }

    @Override
    public double getZeitInStunden() {
        return 0.5; // 1 Minute in Stunden
    }

    @Override
    public double getStreckeInKm() {
        return 0.5;
    }

    @Override
    public double getPreisProKm() {
        return preis;
    }

    public boolean isDefect() {
        return treibstoff == 0.0 || treibstoff < getStreckeInKm();
    }
}
