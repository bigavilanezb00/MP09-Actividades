package UF2.Activitat2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Notes2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        List<Alumne> llistaAlumne = new ArrayList<>();

        String modul = "MP09 - Programacio de serveis i processos";
        int numAlumne = 10;

        int temps_inici = (int) System.currentTimeMillis();

        for (int i = 0; i < numAlumne; i++) {
            Alumne alumnesMP09 = new Alumne(modul + " --> Alumne " + i);
            llistaAlumne.add(alumnesMP09);
        }

        List<Future<Integer>> llistaNotes;
        llistaNotes = executor.invokeAll(llistaAlumne);
        executor.shutdownNow();

        int temps_final = (int) System.currentTimeMillis();

        for (int i = 0; i < llistaNotes.size(); i++) {
            Future<Integer> nota = llistaNotes.get(i);
            System.out.printf("%s : %d%n" , llistaAlumne.get(i).getNom(), nota.get());
        }

        System.out.println("Han trigat: " + (temps_final - temps_inici)/1000 + " segons");
    }
}

