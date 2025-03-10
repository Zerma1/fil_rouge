package lanceurs;

import views.utils.AffichageConsole;
import views.utils.LectureConsole;
import models.entities.Militaire;
import models.entities.Stage;
import models.entities.armees.Aviateur;
import models.entities.armees.Marin;
import models.entities.armees.Terrien;
import models.entities.references.grades.Grade_AAE;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.grades.Grade_MN;
import models.entities.references.specialites.Arme;
import models.entities.references.specialites.SpecialiteAAE;
import models.entities.references.specialites.SpecialiteMN;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ProgMain {

    private static Stage PO85 = new Stage(
            "PO85",
            LocalDate.of(2024,12,2),
            LocalDate.of(2025,07,25));

    public static void main(String[] args) {

        init();
        int choix;
        do{
            afficherNbJourAvantFinStage(PO85);

            //voir dans le preProd
            //AffichageConsole.afficherMenu("MENU PRINCIPAL");

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
            System.out.println(nbMilitaire++ + " : ");
            militaire.sePresenter();
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

        //CHOIX ARMEE
        afficherArmees();

        int choixArmee = LectureConsole.lectureChoixInt(1,3);

        Militaire militaire = null;

        switch (choixArmee){
            case 1 -> militaire = saisirMarin(nom,prenom);
            case 2 -> militaire = saisirAviateur(nom,prenom);
            case 3 -> militaire = saisirTerrien(nom,prenom);
        }

        return militaire;
    }

    private static void afficherArmees(){
        System.out.println("1 : MARINE NATIONALE");
        System.out.println("2 : ARMEE DE L'AIR ET DE L'ESPACE");
        System.out.println("3 : ARMEE DE TERRE");
    }

    private static Marin saisirMarin(String nom, String prenom){
        //SAISIR GRADE
        Grade_MN grade = saisirGradeMN();
        //SAISIR SPE
        SpecialiteMN specialite = saisirSpecialiteMN();
        return new Marin(nom,prenom,grade,specialite);
    }

    private static Aviateur saisirAviateur(String nom, String prenom){
        //SAISIR GRADE
        Grade_AAE grade = saisirGradeAAE();

        //SAISIR SPE
        SpecialiteAAE specialite = saisirSpecialiteAAE();

        return new Aviateur(nom,prenom,grade,specialite);
    }

    private static Terrien saisirTerrien(String nom, String prenom){
        //SAISIR GRADE
        Grade_AdT grade = saisirGradeAdT();

        //SAISIR ARME
        Arme arme = saisirArme();

        return new Terrien(nom,prenom,grade,arme);
    }

    private static Grade_MN saisirGradeMN(){
        for(int i = 0; i<Grade_MN.values().length; i++){
            System.out.println(i+1 + " "  + Grade_MN.values()[i]);
        }

        int choix = LectureConsole.lectureChoixInt(1,Grade_MN.values().length);

        return Grade_MN.values()[choix-1];
    }
    private static Grade_AAE saisirGradeAAE(){
        for(int i = 0; i<Grade_AAE.values().length; i++){
            System.out.println(i+1 + " "  + Grade_AAE.values()[i]);
        }

        int choix = LectureConsole.lectureChoixInt(1,Grade_AAE.values().length);

        return Grade_AAE.values()[choix-1];

    }
    private static Grade_AdT saisirGradeAdT(){
        for(int i = 0; i<Grade_AdT.values().length; i++){
            System.out.println(i+1 + " "  + Grade_AdT.values()[i]);
        }

        int choix = LectureConsole.lectureChoixInt(1,Grade_AdT.values().length);

        return Grade_AdT.values()[choix-1];
    }

    private static SpecialiteMN saisirSpecialiteMN(){
        for(int i = 0; i<SpecialiteMN.values().length; i++){
            System.out.println(i+1 + " "  + SpecialiteMN.values()[i]);
        }

        int choix = LectureConsole.lectureChoixInt(1,SpecialiteMN.values().length);

        return SpecialiteMN.values()[choix-1];
    }
    private static SpecialiteAAE saisirSpecialiteAAE(){
        for(int i = 0; i<SpecialiteAAE.values().length; i++){
            System.out.println(i+1 + " "  + SpecialiteAAE.values()[i]);
        }

        int choix = LectureConsole.lectureChoixInt(1,SpecialiteAAE.values().length);

        return SpecialiteAAE.values()[choix-1];
    }
    private static Arme saisirArme(){
        for(int i = 0; i<Arme.values().length; i++){
            System.out.println(i+1 + " "  + Arme.values()[i]);
        }

        int choix = LectureConsole.lectureChoixInt(1,Arme.values().length);

        return Arme.values()[choix-1];
    }


//    private static Grade saisirGrade(){
//
//        for(int i = 0; i<Grade.values().length; i++){
//            System.out.println(i+1 + " "  + Grade.values()[i]);
//        }
//
//        int choix = LectureConsole.lectureChoixInt(1,Grade.values().length);
//
//        return Grade.values()[choix-1];
//    }

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

    private static void init(){
        //Création de la section
        PO85.ajouterMilitaire(new Marin("ZERMANI", "Baptiste", Grade_MN.QUARTIER_MAITRE, SpecialiteMN.TECHNICIEN_SYSTEMES_NUMERIQUES));
        PO85.ajouterMilitaire(new Marin("LE GLUDIC", "Quentin", Grade_MN.MAITRE, SpecialiteMN.TECHNICIEN_SYSTEMES_NUMERIQUES));
        PO85.ajouterMilitaire(new Terrien("FONTAINE", "Baptiste", Grade_AdT.SERGENT, Arme.TROUPES_DE_MARINE));
        PO85.ajouterMilitaire(new Terrien("FAURE", "Bryce", Grade_AdT.SERGENT, Arme.TRANSMISSION));
        PO85.ajouterMilitaire(new Aviateur("BOUTANT", "Matthieu", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        PO85.ajouterMilitaire(new Aviateur("LEMARTINEL", "Thomas", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        PO85.ajouterMilitaire(new Aviateur("EUZEN", "Ashley", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        PO85.ajouterMilitaire(new Aviateur("VILLENEUVE", "Harry", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        PO85.ajouterMilitaire(new Aviateur("JOLY", "Simon", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        PO85.ajouterMilitaire(new Terrien("KILCHEM", "Thomas", Grade_AdT.SERGENT, Arme.TRANSMISSION));
        PO85.ajouterMilitaire(new Aviateur("MICHELENA", "Patxi", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        PO85.ajouterMilitaire(new Aviateur("LENOBLE", "Cyril", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        PO85.ajouterMilitaire(new Aviateur("OLSEN", "Yves", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
        PO85.ajouterMilitaire(new Aviateur("ROKOTOBE", "Tsriniaina", Grade_AAE.SERGENT, SpecialiteAAE.RESPONSABLE_SYSTEMES_NUMERIQUE));
    }




}
