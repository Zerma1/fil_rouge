package views.facades;

import models.entities.Stage;
import models.entities.references.Grade;
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
    int choixGradeMembre(int min, int max);

    String saisirChaineDeCaractere(String entete);
    void afficherChaineDeCaractere(String entete);
    int saisirInt(String entete);

    Stage selectionnerStage(List<Stage> lesStage);

    void afficherGradeAdt(List<Grade_AdT> grades);
    void afficherArme(List<Arme> arme);
//    Grade_AAE saisirGradeAAE();
//    Grade_MN saisirGradeMN();
//111
//    Arme selectionnerArme();
//    SpecialiteAAE selectionnerSpecialiteAAE();
//    SpecialiteMN saisirSpecialiteMN();
}
