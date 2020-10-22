public class Auto {
    int snelheid = 0;
    private int kilometerstand = 25000;
    String merk = "Toyota";

    void start() {
        System.out.println("De " + merk + " start");
    }

    void stop() {
        System.out.println("De " + merk +" stopt");
    }

    void geefGas() {
        System.out.println("De " + merk +" rijdt " + (snelheid+= 20) + "km/u");
    }

    //getter van de private variabele
    public int getKilometerStand() {
        return kilometerstand;
    }

    //setter voor nieuwe kilometerstand
    public void setKilometerstand(int stand) {
        this.kilometerstand = stand;
    }

    //setter voor nieuw merk
    public  void  setMerk(String merk) {
        this.merk = merk;
    }


}
