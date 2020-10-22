public class testAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.start();
        auto1.stop();
        auto1.geefGas();

        System.out.println("De kilometerstand van de " + auto1.merk + " is: " + auto1.getKilometerStand());


        Auto auto2 = new Auto();

        auto2.setKilometerstand(12500);

        auto2.start();
        auto2.stop();
        auto2.geefGas();
        System.out.println("De kilometerstand van de " + auto2.merk + " is: " + auto2.getKilometerStand());

        Auto auto3 = new Auto();
        auto3.setMerk("Volvo");
        auto3.setKilometerstand(7500);
        auto3.start();
        auto3.geefGas();
        auto3.geefGas();
        auto3.geefGas();
        auto3.stop();
        System.out.println("De kilometerstand van de " + auto3.merk + " is: " + auto3.getKilometerStand());







    }


}
