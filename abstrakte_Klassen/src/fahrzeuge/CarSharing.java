package fahrzeuge;

public class CarSharing extends Verkehrsmittel{
    public CarSharing(double geschwindigkeit, double preis, double treibstoff) {
        super(geschwindigkeit, preis, treibstoff);
    }

    @Override
    public String getArt() {
        return "Car-Sharing";
    }

    @Override
    public double getZeitInStunden() {
        return 0.15; // 9 Minuten in Stunden
    }

    @Override
    public double getStreckeInKm() {
        return 2.0;
    }

    @Override
    public double getPreisProKm() {
        return preis;
    }
}
