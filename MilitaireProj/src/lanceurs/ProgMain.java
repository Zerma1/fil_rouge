package lanceurs;

import commons.utils.AffichageConsole;
import commons.utils.LecureConsole;
import entities.grades.GradesAire;
import entities.Militaire;
import entities.Section;

import java.util.ArrayList;
import java.util.List;


public class ProgMain {

    private static List<Militaire> lesPO85 = new ArrayList<>();
    private static List<Section> sections = new ArrayList<>();

    public static void main(String[] args) {

        init();
        int choix;

        sections.add(new Section("PO85", "2021-09-01", "2022-09-01", lesPO85));

        do {

            AffichageConsole.afficherMenu("MENU PRINCIPALE :");

            choix = LecureConsole.lectureChoisInt(0, 3);

            gestionMenu(choix);

        }while (choix != 0);

    }



    /**
     * Gestion du menu
     * @param choix
     */
    private static void gestionMenu(int choix) {
        switch (choix){
            case 1:
                //creerSection();
                break;
            case 2:
                // afficherSection();
                break;
            case 3:
                //ajouterMilitaire();
                break;
            case 4:
                //supprimerMilitaire();
                break;
            case 5:
                //modifierMilitaire();
                break;
            case 6:
                //designerChefSection();
                break;
            case 0:
                System.out.println("Au revoir");
                break;

        }
    }

//    /**
//     * Affiche les membres de la section
//     */
//    private static void afficherSection(){
//        AffichageConsole.printListe("Les PO85 :", lesPO85);
//    }
    /**
     * Affiche le menu
     */
    private static void afficherMenu(){
        System.out.println("Menu :");
        System.out.println("1 - Creer section");
        System.out.println("2 - Afficher les militaires");
        System.out.println("3 - Ajouter un militaire");
        System.out.println("4 - Supprimer un militaire");
        System.out.println("5 - Modifier un militaire");
        System.out.println("0 - Quitter");
    }
    /**
     * Initialise la section
     */
    private static void init(){
        lesPO85.add(new Militaire("LE GLUDIC", "Quentin", GradesAire.MAITRE, 1));
        lesPO85.add(new Militaire("FONTAINE", "Baptiste", GradesAire.SERGENT, 2));
        lesPO85.add(new Militaire("FAURE", "Bryce", GradesAire.SERGENT, 3));
        lesPO85.add(new Militaire("KICHELM", "Thomas", GradesAire.SERGENT, 4));
        lesPO85.add(new Militaire("BOUTTANT", "Matthieu", GradesAire.SERGENT, 5));
        lesPO85.add(new Militaire("LEMARTINEL", "Thomas", GradesAire.SERGENT, 6));
        lesPO85.add(new Militaire("JOLY", "Simon", GradesAire.SERGENT, 7));
        lesPO85.add(new Militaire("MICHELENA", "Patxi", GradesAire.SERGENT, 8));
        lesPO85.add(new Militaire("LENOBLE", "Cyril", GradesAire.SERGENT, 9));
        lesPO85.add(new Militaire("VILLENEUVE", "Harry", GradesAire.SERGENT, 10));
        lesPO85.add(new Militaire("EUZEN", "Ashley", GradesAire.SERGENT, 11));
        lesPO85.add(new Militaire("OLSEN", "Yves", GradesAire.SERGENT, 12));
        lesPO85.add(new Militaire("RAKOTOBE", "Tsiriniaina", GradesAire.SERGENT, 13));
    }

}
