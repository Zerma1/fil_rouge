package views.facade;

import models.entities.Militaire;
import models.entities.Stage;
import models.entities.references.grades.Grade_AAE;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.grades.Grade_MN;
import models.entities.references.specialites.Arme;
import models.entities.references.specialites.SpecialiteMN;
import views.utils.ADC_Ptaczala.AffichageConsole;
import views.utils.ADC_Ptaczala.LectureConsole;
import views.utils.Perso.utilPrint;
import views.utils.Perso.utilRead;

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
    public void afficherSection(Stage stage) {
        utilPrint.printListe(stage.getSection());
    }

//    @Override
//    public Militaire creerMilitair() {
//        // recuperer un nom
//        // recuperer un prenom
//        // choisir armee
//        // recuperer un spe
//        // recuperer un grade
//        //return factory.creermilitair(nom, prenom, armee, spe, grade);
//
//        return null;
//    }

    @Override
    public String saisirNom() {
        utilPrint.printString("Nom : ");
        return "";
    }

    @Override
    public String saisirPrenom() {
        utilPrint.printString("Nom : ");
        return "";
    }


}
