package lanceurs;

import commons.utils.AffichageConsole;
import commons.utils.LecureConsole;
import entities.grades.Grades;
import entities.armee.Militaire;

import java.util.ArrayList;
import java.util.List;

public class ProgMain {

    private static List<Militaire> lesPO85 = new ArrayList<>();
    //MAIN
    public static void main(String[] args) {

        init();
        int choix;

        do {

            AffichageConsole.afficherMenu("MENU PRINCIPALE :");

            choix = LecureConsole.lectureChoisInt(0, 3);

            gestionMenu(choix);

        }while (choix != 0);

    }

//////////////////////////////////////////////
    //MENUE
    /**
     * Gestion du menu
     * @param choix
     */
    private static void gestionMenu(int choix) {
        switch (choix){
            case 1:
                afficherSection();
                break;
            case 2:
                ajouterMembreSection();
                break;
            case 3:
                supprimerMembreSection();
                break;
            default:
                System.out.println("Le chois est invalide");
                break;
        }
    }
    /**
     * Affiche le menu
     */
    private static void afficherMenu(){
        System.out.println("Menu :");
        System.out.println("1 - Afficher les militaires");
        System.out.println("2 - Ajouter un militaire");
        System.out.println("3 - Supprimer un militaire");
        System.out.println("4 - Modifier un militaire");
        System.out.println("0 - Quitter");
    }

    //SECTION
    /**
     * Initialise la section
     */
    private static void init(){
        lesPO85.add(new Militaire("LE GLUDIC", "Quentin", Grades.MAITRE, 1));
        lesPO85.add(new Militaire("FONTAINE", "Baptiste", Grades.SERGENT, 2));
        lesPO85.add(new Militaire("FAURE", "Bryce", Grades.SERGENT, 3));
        lesPO85.add(new Militaire("KICHELM", "Thomas", Grades.SERGENT, 4));
        lesPO85.add(new Militaire("BOUTTANT", "Matthieu", Grades.SERGENT, 5));
        lesPO85.add(new Militaire("LEMARTINEL", "Thomas", Grades.SERGENT, 6));
        lesPO85.add(new Militaire("JOLY", "Simon", Grades.SERGENT, 7));
        lesPO85.add(new Militaire("MICHELENA", "Patxi", Grades.SERGENT, 8));
        lesPO85.add(new Militaire("LENOBLE", "Cyril", Grades.SERGENT, 9));
        lesPO85.add(new Militaire("VILLENEUVE", "Harry", Grades.SERGENT, 10));
        lesPO85.add(new Militaire("EUZEN", "Ashley", Grades.SERGENT, 11));
        lesPO85.add(new Militaire("OLSEN", "Yves", Grades.SERGENT, 12));
        lesPO85.add(new Militaire("RAKOTOBE", "Tsiriniaina", Grades.SERGENT, 13));
    }
    /**
     * Affiche les membres de la section
     */
    private static void afficherSection(){
        AffichageConsole.printListe("Les PO85 :", lesPO85);
    }
    /**
     * Ajoute un membre à la section
     */
    private static void ajouterMembreSection(){
        //parametre du militaire
        System.out.println("Nom :");
        String nom = LecureConsole.lectureChoisString();
        System.out.println("Prenom :");
        String prenom = LecureConsole.lectureChoisString();
        System.out.println("Grade :");
        Grades grade = Grades.setGrade();
        System.out.println("Matricule :");


        int matricule = LecureConsole.lectureChoisInt();

        //ajouter le militair dans la liste
        lesPO85.add(new Militaire(nom, prenom, grade, matricule));

    }
    /**
     * Supprime un membre de la section
     */
    private static void supprimerMembreSection(){

        AffichageConsole.printListe("Les PO85 :", lesPO85);

        System.out.println("Choisir un membre à supprimer :");

        int index = LecureConsole.lectureChoisInt(1, lesPO85.size());

        lesPO85.remove(index-1);
    }

}
