package lanceurs;

import commons.utils.AffichageConsole;
import commons.utils.LecureConsole;
import entities.Marine;
import entities.Aire;
import entities.Terre;
import entities.Militaire;
import entities.Section;
import entities.grades.GradesAire;
import entities.grades.GradesMarine;
import entities.grades.GradesTerre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgMain {

    private static List<Militaire> lesPO85 = new ArrayList<>();
    private static List<Section> sections = new ArrayList<>();

    public static void main(String[] args) {

        init();
        int choix;

        sections.add(new Section("PO85", LocalDate.parse("2024-12-02"), LocalDate.parse("2025-07-25"), lesPO85));

        do {
            afficherMenu();
            choix = LecureConsole.lectureChoisInt(0, 5);
            gestionMenu(choix);
        } while (choix != 0);
    }

    /**
     * Gestion du menu
     * @param choix
     */
    private static void gestionMenu(int choix) {
        switch (choix) {
            case 1:
                // creerSection();
                break;
            case 2:
                afficherSection();
                break;
            case 3:
                ajouterMilitaire();
                break;
            case 4:
                supprimerMilitaire();
                break;
            case 5:
                // modifierMilitaire();
                break;
            case 0:
                System.out.println("Au revoir");
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }

    /**
     * Affiche les membres de la section
     */
    private static void afficherSection() {
        for (Section section : sections) {
            section.afficherSection();
        }
    }

    /**
     * Ajoute un militaire à la section
     */
    private static void ajouterMilitaire() {
        Section section = sections.get(0); // Assuming we are adding to the first section
        section.ajouterMembre();
    }

    /**
     * Supprime un militaire de la section
     */
    private static void supprimerMilitaire() {
        Section section = sections.get(0); // Assuming we are removing from the first section
        section.supprimerMembreSection();
    }

    /**
     * Affiche le menu
     */
    private static void afficherMenu() {
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
    private static void init() {
        lesPO85.add(new Marine("LE GLUDIC", "Quentin", 1, GradesMarine.MAITRE));
        lesPO85.add(new Aire("FONTAINE", "Baptiste", 2, GradesAire.SERGENT));
        lesPO85.add(new Aire("FAURE", "Bryce", 3, GradesAire.SERGENT));
        lesPO85.add(new Aire("KICHELM", "Thomas", 4, GradesAire.SERGENT));
        lesPO85.add(new Aire("BOUTTANT", "Matthieu", 5, GradesAire.SERGENT));
        lesPO85.add(new Aire("LEMARTINEL", "Thomas", 6, GradesAire.SERGENT));
        lesPO85.add(new Aire("JOLY", "Simon", 7, GradesAire.SERGENT));
        lesPO85.add(new Aire("MICHELENA", "Patxi", 8, GradesAire.SERGENT));
        lesPO85.add(new Aire("LENOBLE", "Cyril", 9, GradesAire.SERGENT));
        lesPO85.add(new Aire("VILLENEUVE", "Harry", 10, GradesAire.SERGENT));
        lesPO85.add(new Aire("EUZEN", "Ashley", 11, GradesAire.SERGENT));
        lesPO85.add(new Aire("OLSEN", "Yves", 12, GradesAire.SERGENT));
        lesPO85.add(new Aire("RAKOTOBE", "Tsiriniaina", 13, GradesAire.SERGENT));
        lesPO85.add(new Marine("ZERMANI", "Baptiste", 2021, GradesMarine.QUARTIER_MAITRE));
    }
}