package views.utils.Perso;

import java.util.List;

public class utilPrint {

    /**
     * Permet de derouler une liset<?> et d'afficher les elements
     * @param titre
     * @param liste
     */
    public static <T> void  printListe(String titre, List<T> liste){
        System.out.println(titre);
        int i = 1;
        for (T obj : liste) {
            System.out.println(i + " - " + obj.toString());
            i++;
        }
    }
    /**
     * Affiche une liste d'objets
     * @param liste
     */
    public static <T> void printListe(List<T> liste){
        int i = 1;
        for (T obj : liste) {
            System.out.println(i + " - " + obj.toString());
            i++;
        }
    }

    public static void printErreur(final String msg) {
        final String message = String.format("Erreur : %s", msg);
        utilPrint.printString(message);
    }

    public static void printString(final String msg) {
        System.out.println(msg);
    }
}
