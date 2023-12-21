package tokioSchool;

import java.util.Collections;
import java.util.List;

public class OrdPalNumDec extends AlgoritmoOrdenacion{
    @Override
    public void ordena(List<Carta> listaCartas) {
        // algoritmo de ordenaci�n
        // Algoritmo de ordenación descendente por palo y número
        Collections.sort(listaCartas, (c1, c2) -> {
            int paloComparison = c2.getPalo().compareTo(c1.getPalo());
            if (paloComparison == 0) {
                return c2.getNumero().compareTo(c1.getNumero());
            } else {
                return paloComparison;
            }
        });
    }


}
