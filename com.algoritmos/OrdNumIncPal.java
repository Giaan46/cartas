package tokioSchool;

import java.util.Collections;
import java.util.List;

public class OrdNumIncPal extends AlgoritmoOrdenacion {

    @Override
    public void ordena(List<Carta> listaCartas) {
        // Algoritmo de ordenaci�n
        Collections.sort(listaCartas, (c1, c2) -> {
            int numeroComparison = c1.getNumero().compareTo(c2.getNumero());
            if (numeroComparison == 0) {
                return c1.getPalo().compareTo(c2.getPalo());
            } else {
                return numeroComparison;
            }
        });
    }



}
