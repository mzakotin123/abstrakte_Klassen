package fahrzeuge;

abstract class Verkehrsmittel {
    double geschwindigkeit;
    double preis;
    double treibstoff;
    String art;
    static final double gesStrecke = 7.0;
    static final double gesZeit = 4.0;
    static final String datum = "04.10.2024";

    public Verkehrsmittel(double geschwindigkeit, double preis, double treibstoff) {
        this.geschwindigkeit = geschwindigkeit;
        this.preis = preis;
        this.treibstoff = treibstoff;
    }

    public abstract String getArt();
    public abstract double getZeitInStunden();
    public abstract double getStreckeInKm();
    public abstract double getPreisProKm();
}
