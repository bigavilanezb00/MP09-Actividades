package UF2.Activitat1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final int numVegades = 10;

    public static void main(String[] args) {

        List<Multiplicacio> llistaMultiplicacions = new ArrayList<Multiplicacio>();

        for (int i = 0; i < numVegades; i++) {
            Multiplicacio calcul = new Multiplicacio((int)(Math.random()*10), (int)(Math.random()*10));
            llistaMultiplicacions.add(calcul);
        }

        for (int i = 0; i < llistaMultiplicacions.size(); i++) {
            System.out.println("El resultat de la " + (i+1) + " operacio es: " + llistaMultiplicacions.get(i).operacioMultiplicacio());
        }

    }
}
