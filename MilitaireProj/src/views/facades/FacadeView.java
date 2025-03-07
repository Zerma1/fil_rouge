package views.facades;

import models.entities.Stage;
import models.entities.references.grades.Grade_AAE;
import models.entities.references.grades.Grade_AdT;
import models.entities.references.grades.Grade_MN;
import models.entities.references.specialites.Arme;
import models.entities.references.specialites.SpecialiteAAE;
import models.entities.references.specialites.SpecialiteMN;

import java.util.List;

public interface FacadeView {

    int choixMenu(int min, int max);

    void afficherMenu(List<String> menu);

    void afficherSectionDeStage(Stage stage);

    String saisirNom();
    String saisirPrenom();


}
