package tokioSchool;

public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Mazo mazo = baraja.getMazo();
        System.out.println("Mazo sin ordenar: " + mazo);

        mazo.setAlgoritmo(new OrdPalNumInc());
        mazo.ordena();
        System.out.println("Mazo ordenado por palo ascendente y número ascendente: " + mazo);

        mazo.setAlgoritmo(new OrdPalNumDec());
        mazo.ordena();
        System.out.println("Mazo ordenado por palo descendente y número descendente: " + mazo);

        mazo.setAlgoritmo(new OrdNumIncPal());
        mazo.ordena();
        System.out.println("Mazo ordenado por número ascendente y palo ascendente: " + mazo);
    }
}
