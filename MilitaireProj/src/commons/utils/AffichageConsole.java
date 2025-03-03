package commons.utils;

import java.util.List;
import java.util.Objects;

public class AffichageConsole {

    public static void afficherMenu(String titreMenu){
        System.out.println(titreMenu);
        System.out.println("1 - Nouvelle section");
        System.out.println("2 - Afficher les millitaires");
        System.out.println("3 - Ajouter un millitaire");
        System.out.println("4 - Supprimer un millitaire");
        System.out.println("5 - Modifier un millitaire");
        System.out.println("0 - Quitter");
    }

    /**
     * Permet de derouler une liset<?> et d'afficher les elements
     * @param titre
     * @param liste
     */
    public static <T> void  printListe(Objects titre, List<T> liste){
        System.out.println(titre.toString());
        int i = 1;
        for (T obj : liste) {
            System.out.println(i + " - " + obj.toString());
            i++;
        }
    }
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

}
