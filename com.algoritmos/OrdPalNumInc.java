package tokioSchool;

import java.util.Collections;
import java.util.List;

public class OrdPalNumInc extends AlgoritmoOrdenacion {

    @Override
    public void ordena(List<Carta> listaCartas) {
        // Algoritmo de ordenaci�n
        // Algoritmo de ordenación ascendente por palo y número
        Collections.sort(listaCartas, (c1, c2) -> {
            int paloComparison = c1.getPalo().compareTo(c2.getPalo());
            if (paloComparison == 0) {
                return c1.getNumero().compareTo(c2.getNumero());
            } else {
                return paloComparison;
            }
        });
    }



}
