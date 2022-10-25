package UF2.Activitat1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final int numVegades = 10;

    public static void main(String[] args) {

        List<Multiplicacio> llistaMultiplicacions = new ArrayList<Multiplicacio>();

        long temp1 = System.currentTimeMillis();
        for (int i = 0; i < numVegades; i++) {
            Multiplicacio calcul = new Multiplicacio((int)(Math.random()*10), (int)(Math.random()*10));
            llistaMultiplicacions.add(calcul);
        }

        long temp2 = System.currentTimeMillis();
        for (int i = 0; i < llistaMultiplicacions.size(); i++) {
            System.out.println("El resultat de la " + (i+1) + " operacio es: " + llistaMultiplicacions.get(i).operacioMultiplicacio());
        }

        System.out.println();
        System.out.println("Les operacions han trigat " + (temp2-temp1) + " Milisegons!");
    }
}
