package lanceurs;

import models.entities.Militaire;
import models.entities.Stage;
import models.entities.references.Grade;
import views.utils.LectureConsole;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProgMain {

    private static Stage PO85 = new Stage(
            "PO85",
            LocalDate.of(2024,12,2),
            LocalDate.of(2025,07,25));

    public static void main(String[] args) {

        int choix;
        do{
            afficherNbJourAvantFinStage(PO85);

            //AffichageConsole.afficherMenuSimple();

            choix = LectureConsole.lectureChoixInt(0,3);

            gestionMenu(choix);

        }while(choix != 0);
    }

    public static void gestionMenu(int choix){
        switch (choix){
            case 1 -> afficherLaSection();
            case 2 -> ajouterMembreSection();
            case 3 -> retirerMembreSection();
        }
    }

    private static void afficherLaSection(){

        int nbMilitaire = 1;
        for (Militaire militaire : PO85.getSection()) {
            System.out.println(nbMilitaire++ + " : "  + militaire.getNom() + " " + militaire.getPrenom());
        }
    }

    private static void ajouterMembreSection(){
        //Créer un militaire
        Militaire nouveauMilitaire = saisirMilitaire();

        //Ajouter le militaire
        PO85.ajouterMilitaire(nouveauMilitaire);

    }

    private static Militaire saisirMilitaire(){

        String nom = LectureConsole.lectureChaineCaracteres("Saisir le nom : ");
        String prenom = LectureConsole.lectureChaineCaracteres("Saisir le prénom : ");

        Grade grade = saisirGrade();

        return new Militaire(nom, prenom) {
            @Override
            public boolean sePresenter() {

                return false;
            }
        };
    }

    private static Grade saisirGrade(){

        for(int i = 0; i<Grade.values().length; i++){
            System.out.println(i+1 + " "  + Grade.values()[i]);
        }

        int choix = LectureConsole.lectureChoixInt(1,Grade.values().length);

        return Grade.values()[choix-1];
    }

    private static void retirerMembreSection(){
        afficherLaSection();
        int choix = LectureConsole.lectureChoixInt(1, PO85.getSection().size());

        Militaire militaire = PO85.getSection().get(choix-1);

        PO85.supprimerMiltaire(militaire);
    }

    public static void afficherNbJourAvantFinStage(Stage stage){

        long nbTotalJour = nbJourEntreDeuxDate(stage.getDateDebut(), stage.getDateFin());
        long nbJourAvantFin = nbJourEntreDeuxDate(LocalDate.now(), stage.getDateFin());

        System.out.println("Nombre de jour avant la fin du stage " + nbJourAvantFin + "/" + nbTotalJour);
    }

    private static long nbJourEntreDeuxDate(LocalDate dateDebut, LocalDate dateFin){

        return ChronoUnit.DAYS.between(dateDebut, dateFin);
    }


}
