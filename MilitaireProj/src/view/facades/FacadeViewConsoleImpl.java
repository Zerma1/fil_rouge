package view.facades;


import model.entities.FactoryMilitaire;
import model.entities.Militaire;
import model.entities.Stage;
import model.entities.exceptions.FactoryException;
import model.entities.references.*;
import model.utils.Calculateur;
import view.utils.AffichageConsole;
import view.utils.LectureConsole;
import view.utils.UtilsView;

import java.util.ArrayList;
import java.util.List;

public class FacadeViewConsoleImpl implements FacadeView {

    @Override
    public void afficherMenu(List<String> menu) {
        AffichageConsole.afficherMenuSimple(menu);
    }

    @Override
    public void afficherNbJourAvantFin(Stage stage) {
        AffichageConsole.afficherMessageAvecSautLigne(stage.afficherNbJourAvantFin());
    }

    @Override
    public void afficherSection(List<Militaire> section) {
        AffichageConsole.afficherMessageAvecSautLigne("Liste des militaires section : ");
        for (int i = 0; i < section.size(); i++) {
            AffichageConsole.afficherMessageAvecSautLigne(section.get(i).toString());
        }
    }

    @Override
    public int choisirArmee() {
        List<String> listChoix = new ArrayList<String>();
        listChoix.add("Terre");
        listChoix.add("Air");
        listChoix.add("Marine");

        AffichageConsole.afficherMessageAvecSautLigne("Armée : ");
        AffichageConsole.afficherMenuSimple(listChoix);

        AffichageConsole.afficherMessageSansSautLigne("Selctionner l'armée : ");
        return LectureConsole.lectureChoixInt(1 , listChoix.size());
    }

    @Override
    public int choisirMenu(int nombreChoix) {
        return LectureConsole.lectureChoixInt(1, nombreChoix);
    }

    @Override
    public Militaire creerMilitaire(int choixArmee) {
        Militaire militaire = null;

        switch (choixArmee) {
            case 1 -> militaire = creerTerrien();
            case 2 -> militaire = creerAviateur();
            case 3 -> militaire = creerMarin();
        }

        return militaire;
    }

    @Override
    public Militaire creerTerrien() {
        GradeTerrien[] tabGrade = GradeTerrien.values();
        Arme[] tabArme = Arme.values();


        AffichageConsole.afficherMessageAvecSautLigne("Garde du militaire : ");
        AffichageConsole.afficherMenuSimple(UtilsView.enumToListString(GradeTerrien.class));

        GradeTerrien grade = tabGrade[LectureConsole.lectureChoixInt(1 , tabGrade.length)-1];

        AffichageConsole.afficherMessageAvecSautLigne("Arme du militaire : ");
        AffichageConsole.afficherMenuSimple(Arme.getListArmeToString());

        Arme arme = tabArme[LectureConsole.lectureChoixInt(1 , tabArme.length)-1];

        String nom = LectureConsole.lectureChaineCaracteres("Saisir le nom du militaire : ");

        String prenom = LectureConsole.lectureChaineCaracteres("Saisir le prenom du militaire : ");

        Militaire monMilitaire=null;

        try{
            monMilitaire =  FactoryMilitaire.creerTerrien(nom, prenom, Calculateur.randLong(1000000000, 2099999999), grade, arme);
        }catch (FactoryException e){
            afficherMessageErreur(e.getMessage());
        }

        return monMilitaire;
    }

    @Override
    public Militaire creerAviateur() {
        GradeAviateur[] tabGrade = GradeAviateur.values();
        SpecialiteAAE[] tabSpecialiteAAE = SpecialiteAAE.values();


        AffichageConsole.afficherMessageAvecSautLigne("Garde du militaire : ");
        AffichageConsole.afficherMenuSimple(GradeAviateur.getListGradeToString());

        GradeAviateur grade = tabGrade[LectureConsole.lectureChoixInt(1 , tabGrade.length)-1];

        AffichageConsole.afficherMessageAvecSautLigne("Specialite AAE du militaire : ");
        AffichageConsole.afficherMenuSimple(SpecialiteAAE.getListSpecialiteAAEToString());

        SpecialiteAAE specialiteAAE = tabSpecialiteAAE[LectureConsole.lectureChoixInt(1 , tabSpecialiteAAE.length)-1];

        String nom = LectureConsole.lectureChaineCaracteres("Saisir le nom du militaire : ");

        String prenom = LectureConsole.lectureChaineCaracteres("Saisir le prenom du militaire : ");

        Militaire monMilitaire=null;
        try{
            monMilitaire =  FactoryMilitaire.creerAviateur(nom, prenom, Calculateur.randLong(1000000000, 2099999999), grade, specialiteAAE);
        }catch (FactoryException e){
            System.err.println("Exception : " + e.getMessage());
            e.printStackTrace();
        }

        return monMilitaire;
    }

    @Override
    public Militaire creerMarin() {
        GradeMarin[] tabGrade = GradeMarin.values();
        SpecialiteMN[] tabSpecialiteMN = SpecialiteMN.values();


        AffichageConsole.afficherMessageAvecSautLigne("Garde du militaire : ");
        AffichageConsole.afficherMenuSimple(GradeMarin.getListGradeToString());

        GradeMarin grade = tabGrade[LectureConsole.lectureChoixInt(1 , tabGrade.length)-1];

        AffichageConsole.afficherMessageAvecSautLigne("Specialite MN du militaire : ");
        AffichageConsole.afficherMenuSimple(SpecialiteMN.getListSpecialiteMNToString());

        SpecialiteMN specialiteMN = tabSpecialiteMN[LectureConsole.lectureChoixInt(1 , tabSpecialiteMN.length)-1];

        String nom = LectureConsole.lectureChaineCaracteres("Saisir le nom du militaire : ");

        String prenom = LectureConsole.lectureChaineCaracteres("Saisir le prenom du militaire : ");

        Militaire monMilitaire=null;
        try{
            monMilitaire =  FactoryMilitaire.creerMarin(nom, prenom, Calculateur.randLong(1000000000, 2099999999), grade, specialiteMN);
        }catch (FactoryException e){
            afficherMessageErreur(e.getMessage());
        }

        return monMilitaire;
    }

    @Override
    public Militaire choisirMilitaireRetirer(List<Militaire> section) {
        List<String> listToStringSection = new ArrayList<>();
        for (int i = 0; i < section.size(); i++) {
            listToStringSection.add(section.get(i).toString());
        }

        AffichageConsole.afficherMessageAvecSautLigne("Militaire a retier : ");
        AffichageConsole.afficherMenuSimple(listToStringSection);

        AffichageConsole.afficherMessageSansSautLigne("Choisiser le militaire a retier : ");

        return section.get(LectureConsole.lectureChoixInt(1 , section.size())-1);
    }

    @Override
    public void afficherMessageErreur(String message) {
        AffichageConsole.afficherErreur(message);
    }
}
