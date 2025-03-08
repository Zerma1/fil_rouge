package views.facades;

import models.entities.Militaire;
import models.entities.Stage;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.specialites.Arme;
import views.utils.AffichageConsole;
import views.utils.LectureConsole;

import java.util.List;

public class FacadeViewImpl implements FacadeView {
    @Override
    public int choixMenu(int min, int max) {
        return LectureConsole.lectureChoixInt(min, max);
    }

    @Override
    public void afficherMenu(List<String> menu) {
        AffichageConsole.afficherMenuSimple(menu);
    }

    @Override
    public void afficherSectionDeStage(Stage stage) {
        for (int i = 0; i < stage.getSection().size(); i++) {
            AffichageConsole.afficherMessageAvecSautLigne(
                    i+1 +"- "+stage.getSection().get(i));
        }
    }

    @Override
    public int choixGradeMembre(int min, int max) {
        return LectureConsole.lectureChoixInt(min, max);
    }

    @Override
    public String saisirChaineDeCaractere(String entete) {
        return LectureConsole.lectureChaineCaracteres(entete);
    }

    @Override
    public void afficherChaineDeCaractere(String entete) {
        AffichageConsole.afficherMessageSansSautLigne(entete);
    }

    @Override
    public int saisirInt(String entete) {
        return LectureConsole.lectureEntier(entete);
    }

    @Override
    public Stage selectionnerStage(List<Stage> lesStage) {
        //Parcourir la liste des Stages
        for (int i = 0; i < lesStage.size(); i++) {
            // Afficher, pour chaque itération, le stage
            AffichageConsole.afficherMessageAvecSautLigne(
                    i+1 +"- "+lesStage.get(i));
        }
        //Selectionner un stage
        AffichageConsole.afficherMessageSansSautLigne("Selection d'un stage : ");
        int choix = LectureConsole.lectureChoixInt(1, lesStage.size());
        //Renvoie le stage selectionner
        return lesStage.get(choix-1);
    }

    @Override
    public void afficherGradeAdt(List<Grade_AdT> grades) {
        for (int i = 0; i < grades.size(); i++) {
            AffichageConsole.afficherMessageAvecSautLigne(i+1 +"- "+grades.get(i));
        }
    }

    @Override
    public void afficherArme(List<Arme> arme) {
        for (int i = 0; i < arme.size(); i++) {
            AffichageConsole.afficherMessageAvecSautLigne(i+1 +"- "+arme.get(i));
        }
    }

}
