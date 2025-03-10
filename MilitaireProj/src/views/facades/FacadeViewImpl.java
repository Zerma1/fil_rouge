package views.facades;

import models.entities.Militaire;
import models.entities.Stage;
import views.utils.AffichageConsole;
import views.utils.LectureConsole;

import java.util.List;

public class FacadeViewImpl implements FacadeView{

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
        for(Militaire militaire : stage.getSection()){
            System.out.println(militaire);
        }
    }

    @Override
    public String saisirNom() {
        return LectureConsole.lectureChaineCaracteres("Nom : ");
    }

    @Override
    public String saisirPrenom() {
        return LectureConsole.lectureChaineCaracteres("Prenom : ");
    }
}
