package UF2.Activitat2;

public class Notes {
    public static void main(String[] args) {

        int numAlumnes = 10;
        int temps_inici;
        int temps_final;
        String Modul = "M09 - Programacio de serveis i processos";
        int notes[] = new int[numAlumnes];

        //instanciem els alumnes
        Alumne[] alumnesM09 = new Alumne[numAlumnes];

        //comencem a contar el temps
        temps_inici = (int) System.currentTimeMillis();

        //Donem nom als alumnes i els posem a fer l'examen
        for (int i=0;i<numAlumnes;i++) {
            alumnesM09[i] = new Alumne(Modul + " --> Alumne " + i);
            notes[i] = alumnesM09[i].Examinar();
        }
        //Han acabat i agafem el temps final
        temps_final = (int) System.currentTimeMillis();

        //traiem els resultats i el temps que han trigat
        for (int i=0;i<numAlumnes;i++) {
            System.out.println(alumnesM09[i].getNom() + " : " + notes[i]);
        }

        System.out.println("Han trigat: " + (temps_final - temps_inici)/1000 + " segons");
    }
    }

