package fahrzeuge;

public class Fahrrad extends Verkehrsmittel{
    private int anzSatteln;

    public Fahrrad(double geschwindigkeit, double preis, double treibstoff, int anzSatteln) {
        super(geschwindigkeit, preis, treibstoff);
        this.anzSatteln = anzSatteln;
    }

    @Override
    public String getArt() {
        if(isTandem()) return "Tandem";
        return "Fahrrad";
    }

    @Override
    public double getZeitInStunden() {
        return 0.1; // 6 Minuten in Stunden
    }

    @Override
    public double getStreckeInKm() {
        return 1.5;
    }

    @Override
    public double getPreisProKm() {
        return preis;
    }

    public String getAnzSatteln() {
       if(anzSatteln < 1 || anzSatteln > 2) {
           System.out.println("Ungültige Anzahl an Satteln!");
       }
       return String.valueOf(anzSatteln);
    }

    public boolean isTandem() {
        return anzSatteln == 2;
    }
}
